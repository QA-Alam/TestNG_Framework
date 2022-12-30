package smarttech.nyc.basepage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import smarttech.nyc.generic.WebEventListener;

public class SupperClass {
	public static Logger logger;
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static Workbook book;
	public static Sheet sheet;
	public static LinkedHashMap<String, Object[]> testresultdata;

	public SupperClass() {
		logger = Logger.getLogger("Test Lead Alam"); // Added logger
		PropertyConfigurator.configure("Log4j.properties");// Added logger
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/smarttech/nyc/configproperties/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void initialization() { // setUP();
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			logger.info("******** I am a chrome browser*********");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("headless")) {
			logger.info("******** I am a headless mode chrome browser*********");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200",
					"--ignore-certificate-errors", "--silent");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("edge")) {
			logger.info("******** I am a edge browser*********");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}

	@BeforeClass(alwaysRun = true)
	public void setupBeforeSuite(ITestContext context) {
		// create a new work book
		book = new XSSFWorkbook();
		// create a new work sheet
		sheet = book.createSheet("TEST_RESULT");
		testresultdata = new LinkedHashMap<String, Object[]>();
		// add test result excel file column header
		// write the header in the first row
		testresultdata.put("1", new Object[] { "TESTER_NMAE", "SCENARIO", "ENVIRONMENT", "DATE_TESTED" });
		testresultdata.put("2", new Object[] { "QA-ALAM", "Valid user can purchase jupiter jackets",
				"QA Envoronment and Chrome Browser", "12/30/2022" });

		testresultdata.put("3", new Object[] { "TEST_ID", "ACTION", "EXPECTED_RESULT", "ACTUAL_RESULT" });

	}

	@AfterClass
	public void setupAfterSuite(ITestContext context) {
		// write excel file and file name is TestResult.xls
		Set<String> keyset = testresultdata.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = testresultdata.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof Date)
					cell.setCellValue((Date) obj);
				else if (obj instanceof Boolean)
					cell.setCellValue((Boolean) obj);
				else if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Double)
					cell.setCellValue((Double) obj);
			}
		}
		try {
			FileOutputStream out = new FileOutputStream(new File("./TestNG_Framework.xlsx"));
			book.write(out);
			out.close();
			System.out.println("Excel written successfully..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

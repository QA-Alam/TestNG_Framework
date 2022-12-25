package smarttech.nyc.listener;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class TestListener implements ITestListener {
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest logger;
	WebDriver driver;

	@Override 
	public void onTestStart(ITestResult result) {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		String repName = "report-" + timeStamp + ".html";

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ExtendReports/" + repName);// specify
																											// location
		// of the report
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-config.xml");

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Alam");

		htmlReporter.config().setDocumentTitle("Automation Test Project"); // Tile of report
		htmlReporter.config().setReportName("Functional Test Report"); // name of the report
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); // location of the chart
		htmlReporter.config().setTheme(Theme.DARK);

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger = extent.createTest(result.getName()); // create new entry in th report
		logger.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
	

	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger = extent.createTest(result.getName()); // create new entry in th report
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED)); // send the passed
		
	} 

	@Override
	public void onTestSkipped(ITestResult result) {
		logger = extent.createTest(result.getName()); // create new entry in th report
		logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
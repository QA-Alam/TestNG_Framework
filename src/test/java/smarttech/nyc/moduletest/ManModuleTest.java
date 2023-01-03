package smarttech.nyc.moduletest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import smarttech.nyc.basepage.SupperClass;
import smarttech.nyc.elementpage.MasterPageFactoryPage;
import smarttech.nyc.generic.CommonUtility;

public class ManModuleTest extends SupperClass {
	MasterPageFactoryPage pf;
	public ManModuleTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		pf = new MasterPageFactoryPage();
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = CommonUtility.getTestData("dataSet");
		return data;
	}

	@Test(dataProvider = "getTestData")
	public void getloginApplication(String First_Name, String Last_Name, String Company, String Street_Address,
			String City, String Postal_Code, String Phone_Number) {
		try {
			pf.getVerifyJackectPrice();
			pf.addAddressDetails(First_Name, Last_Name, Company, Street_Address, City, Postal_Code, Phone_Number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
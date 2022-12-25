package smarttech.nyc.moduletest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import smarttech.nyc.basepage.SupperClass;
import smarttech.nyc.elementpage.MasterPageFactoryPage;
import smarttech.nyc.generic.CommonUtility;
import smarttech.nyc.generic.HighLightElements;
import smarttech.nyc.generic.WaitHelper;

public class ManModuleTest extends SupperClass {
	MasterPageFactoryPage pf;

	public ManModuleTest() {
		super(); // super and this is a java keyword
	}

	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@Test
	public void getloginApplication() {
		pf = new MasterPageFactoryPage();
		pf.getlogin();

		logger.info("User able to mousehover over the men module");
		HighLightElements.drawBorder(pf.getMenModule());
		WaitHelper.seleniumWait(pf.getMenModule(), 30);
		CommonUtility.mouseHover(pf.getMenModule());

		logger.info("User able to mousehover over the tops");
		HighLightElements.drawBorder(pf.getSelectTops());
		WaitHelper.seleniumWait(pf.getSelectTops(), 30);
		CommonUtility.mouseHover(pf.getSelectTops());

		logger.info("User able to click on Jackets");
		HighLightElements.drawBorder(pf.getSelectJacket());
		WaitHelper.seleniumWait(pf.getSelectJacket(), 30);
		CommonUtility.getJSClick(pf.getSelectJacket());

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

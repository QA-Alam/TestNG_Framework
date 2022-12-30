package smarttech.nyc.elementpage;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import smarttech.nyc.basepage.SupperClass;
import smarttech.nyc.generic.CommonUtility;
import smarttech.nyc.generic.HighLightElements;
import smarttech.nyc.generic.WaitHelper;

public class MasterPageFactoryPage extends SupperClass {

	public MasterPageFactoryPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement getClickSignInBTN() {
		return clickSignInBTN;

	}

	@FindBy(id = "email")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		return enterUserName;

	}

	@FindBy(id = "pass")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		return enterPassword;

	}

	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickloggerin;

	public WebElement getClickloggerin() {
		return clickloggerin;

	}

	@FindBy(xpath = "//*[text()='Welcome, Smart Tech!']")
	@CacheLookup
	private WebElement landingPageText;

	public WebElement getVerifiedLandingPageText() {
		return landingPageText;

	}

	// -------------
	@FindBy(xpath = "//span[text()='Men']")
	@CacheLookup
	private WebElement menModule;

	public WebElement getMenModule() {
		return menModule;

	}

	@FindBy(xpath = "(//span[text()='Tops'])[2]")
	@CacheLookup
	private WebElement selectTops;

	public WebElement getSelectTops() {
		return selectTops;

	}

	@FindBy(xpath = "(//span[text()='Jackets'])[2]")
	@CacheLookup
	private WebElement selectJacket;

	public WebElement getSelectJacket() {
		return selectJacket;

	}

	@FindBy(linkText = "Jupiter All-Weather Trainer")
	@CacheLookup
	private WebElement selectJupiterJacket;

	public WebElement getSelectJupiterJacket() {
		return selectJupiterJacket;

	}

	@FindBy(xpath = "//span[text()='Jupiter All-Weather Trainer ']")
	@CacheLookup
	private WebElement verifiedJupiterJacket;

	public WebElement getVerifiedJupiterJacket() {
		return verifiedJupiterJacket;

	}

	@FindBy(xpath = "(//div[@class='swatch-option text'])[2]")
	@CacheLookup
	private WebElement selectSize;

	public WebElement getSelectSize() {
		return selectSize;

	}

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	@CacheLookup
	private WebElement selectColor;

	public WebElement getSelectColor() {
		return selectColor;

	}

	@FindBy(id = "qty")
	@CacheLookup
	private WebElement selectQuantity;

	public WebElement getSelectQuantity() {
		return selectQuantity;

	}

	@FindBy(xpath = "//span[text()='Add to Cart']")
	@CacheLookup
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;

	}

	@FindBy(linkText = "shopping cart")
	@CacheLookup
	private WebElement clickOnShoppingCart;

	public WebElement getClickOnShoppingCart() {
		return clickOnShoppingCart;

	}

	@FindBy(xpath = "//span[text()='Proceed to Checkout']")
	@CacheLookup
	private WebElement proceedToCart;

	public WebElement getClickProceedToCart() {
		return proceedToCart;

	}

	@FindBy(xpath = "//*[text()='New Address']")
	@CacheLookup
	private WebElement addNewAddress;

	public WebElement getClickAddNewAddress() {
		return addNewAddress;

	}

	// ---------address details
	@FindBy(xpath = "(//input[@class='input-text'])[6]")
	@CacheLookup
	private WebElement addFirstName;

	public WebElement getInputFirstName() {
		return addFirstName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[7]")
	@CacheLookup
	private WebElement addLastName;

	public WebElement getInputLastName() {
		return addLastName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[8]")
	@CacheLookup
	private WebElement addCompanyName;

	public WebElement getInputCompanyName() {
		return addCompanyName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[9]")
	@CacheLookup
	private WebElement addStreetName;

	public WebElement getInputStreetName() {
		return addStreetName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[12]")
	@CacheLookup
	private WebElement addCityName;

	public WebElement getInputCityName() {
		return addCityName;

	}

	@FindBy(xpath = "(//select[@class='select'])[1]")
	@CacheLookup
	private WebElement selectStateName;

	public WebElement getSelectStateName() {
		return selectStateName;

	}

	@FindBy(xpath = "(//select[@class='select'])[1]/option")
	@CacheLookup
	private List<WebElement> selectDropDown;

	public List<WebElement> getSelectDropDown() {
		return selectDropDown;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[14]")
	@CacheLookup
	private WebElement addZipCode;

	public WebElement getInputZipCode() {
		return addZipCode;

	}

	@FindBy(xpath = "(//select[@class='select'])[2]")
	@CacheLookup
	private WebElement selectCountryName;

	public WebElement getselectCountryName() {
		return selectCountryName;

	}

	@FindBy(xpath = "(//input[@class='input-text'])[15]")
	@CacheLookup
	private WebElement addPhoneNumber;

	public WebElement getAddPhoneNumber() {
		return addPhoneNumber;

	}

	@FindBy(xpath = "//*[text()='Ship here']")
	@CacheLookup
	private WebElement clickShipHere;

	public WebElement getClickShipHere() {
		return clickShipHere;

	}

	@FindBy(xpath = "//*[@name='ko_unique_3']")
	@CacheLookup
	private WebElement clickShippingMethod;

	public WebElement getClickShippingMethod() {
		return clickShippingMethod;

	}

	@FindBy(xpath = "//span[text()='Next']")
	@CacheLookup
	private WebElement clickOnNext;

	public WebElement getClickOnNext() {
		return clickOnNext;

	}

	@FindBy(xpath = "//*[contains(text(),'Place Order')]")
	@CacheLookup
	private WebElement clickOnPlaceOrder;

	public WebElement getClickOnPlaceOrder() {
		return clickOnPlaceOrder;

	}

	@FindBy(xpath = "//*[contains(text(),'Thank you for your purchase!')]")
	@CacheLookup
	private WebElement verifiedPurchaseText;

	public WebElement getVerifiedPurchaseText() {
		return verifiedPurchaseText;

	}

	@FindBy(xpath = "//div[@class='checkout-success']//strong")
	@CacheLookup
	private WebElement verifiedOrderNumber;

	public WebElement getVerifiedOrderNumber() {
		return verifiedOrderNumber;

	}

	public void addAddressDetails(String FName, String LName, String companyName, String streetName, String cityName,
			String zipCode, String phoneNum) {
		logger.info("User able to add First Name");
		getInputFirstName().clear();
		WaitHelper.seleniumWait(getInputFirstName(), 30);
		getInputFirstName().sendKeys(FName);
		testresultdata.put("20",
				new Object[] { 1d, "User able to add First Name", "It Should enterd the first name", "Pass" });

		logger.info("User able to add Last Name");
		getInputLastName().clear();
		WaitHelper.seleniumWait(getInputLastName(), 30);
		getInputLastName().sendKeys(LName);
		testresultdata.put("21",
				new Object[] { 1d, "User able to add Last Name", "It Should enterd the Last name", "Pass" });

		logger.info("User able to add Company Name");
		getInputCompanyName().clear();
		WaitHelper.seleniumWait(getInputCompanyName(), 30);
		getInputCompanyName().sendKeys(companyName);
		testresultdata.put("22",
				new Object[] { 1d, "User able to add Company Name", "It Should enterd the Company name", "Pass" });

		logger.info("User able to add Street Name");
		getInputStreetName().clear();
		WaitHelper.seleniumWait(getInputStreetName(), 30);
		getInputStreetName().sendKeys(streetName);
		testresultdata.put("23",
				new Object[] { 1d, "User able to add Street Name", "It Should enterd the Street name", "Pass" });

		logger.info("User able to add City Name");
		getInputCityName().clear();
		WaitHelper.seleniumWait(getInputCityName(), 30);
		getInputCityName().sendKeys(cityName);
		testresultdata.put("24",
				new Object[] { 1d, "User able to add City Name", "It Should enterd the City name", "Pass" });

		logger.info("User able to select State Name");
		WaitHelper.seleniumWait(getSelectStateName(), 30);
		CommonUtility.getSelectDropDownList(getSelectDropDown(), "New Jersey");
		testresultdata.put("25", new Object[] { 1d, "User able to select State Name",
				"It Should selected State name from dropdown", "Pass" });

		logger.info("User able to add Zip Code");
		getInputZipCode().clear();
		WaitHelper.seleniumWait(getInputZipCode(), 30);
		getInputZipCode().sendKeys(zipCode);
		testresultdata.put("26",
				new Object[] { 1d, "User able to add Zip Name", "It Should enterd the Zip name", "Pass" });

		logger.info("User able to select Country Name");
		WaitHelper.seleniumWait(getselectCountryName(), 30);
		CommonUtility.getSelectValue(getselectCountryName(), "United States");
		testresultdata.put("27", new Object[] { 1d, "User able to select Country Name",
				"It Should selected Country Name from dropdown", "Pass" });

		logger.info("User able to add Phone Number");
		getAddPhoneNumber().clear();
		WaitHelper.seleniumWait(getAddPhoneNumber(), 30);
		getAddPhoneNumber().sendKeys(phoneNum);
		testresultdata.put("28",
				new Object[] { 1d, "User able to add Phone Number", "It Should enterd Phone Number", "Pass" });

		logger.info("User able to click Ship Here");
		WaitHelper.seleniumWait(getClickShipHere(), 30);
		CommonUtility.getJSClick(getClickShipHere());
		testresultdata.put("29", new Object[] { 1d, "User able to click Ship Here", "It Should clicked", "Pass" });

		logger.info("User able to select Shipping Method");
		WaitHelper.seleniumWait(getClickShippingMethod(), 30);
		CommonUtility.getRadioButton(getClickShippingMethod());
		testresultdata.put("30", new Object[] { 1d, "User able to select Shipping Method",
				"It Should selected shipping method", "Pass" });

		logger.info("User able to click Next");
		WaitHelper.seleniumWait(getClickOnNext(), 30);
		CommonUtility.getJSClick(getClickOnNext());
		testresultdata.put("31",
				new Object[] { 1d, "User able to click Next", "It Should displayed Place Order button", "Pass" });

		logger.info("User able to click Place Order");
		WaitHelper.seleniumWait(getClickOnPlaceOrder(), 30);
		CommonUtility.getJSClick(getClickOnPlaceOrder());
		testresultdata.put("32", new Object[] { 1d, "User able to click Place Order",
				"It Should displayed order confermation", "Pass" });

		logger.info("User able to verify Thank You text");
		HighLightElements.drawBorder(getVerifiedPurchaseText());
		WaitHelper.seleniumWait(getVerifiedPurchaseText(), 30);
		String actualV = getVerifiedPurchaseText().getText();
		String expectedV = prop.getProperty("VerifyPurchaseText");
		CommonUtility.getAssert(expectedV, actualV);
		testresultdata.put("33", new Object[] { 1d, "User able to verify Thank You text",
				"It Should displayed text Thank you for your purchase!", "Pass" });

		logger.info("User able to verify Thank You text");
		HighLightElements.drawBorder(getVerifiedOrderNumber());
		WaitHelper.seleniumWait(getVerifiedOrderNumber(), 30);
		String actualNum = getVerifiedPurchaseText().getText();
		System.out.println(actualNum);
		testresultdata.put("34",
				new Object[] { 1d, "User able to verify Thank You text", "It Should displayed order number", "Pass" });

	}

	public void getlogin() {
		logger.info("User able to click on sign in button");
		HighLightElements.drawBorder(getClickSignInBTN());
		WaitHelper.seleniumWait(getClickSignInBTN(), 30);
		CommonUtility.getJSClick(getClickSignInBTN());
		testresultdata.put("4",
				new Object[] { 1d, "User able to click on sign in button", "It Should clicked", "Pass" });

		logger.info("User able to enter username");
		HighLightElements.drawBorder(getEnterUserName());
		WaitHelper.seleniumWait(getEnterUserName(), 30);
		getEnterUserName().sendKeys(prop.getProperty("userName"));
		testresultdata.put("5", new Object[] { 1d, "User able to enter username", "It Should Enterd", "Pass" });

		logger.info("User able to enter password");
		HighLightElements.drawBorder(getEnterPassword());
		WaitHelper.seleniumWait(getEnterPassword(), 30);
		getEnterPassword().sendKeys(prop.getProperty("passWord"));
		testresultdata.put("6", new Object[] { 1d, "User able to enter password", "It Should Enterd", "Pass" });

		logger.info("User able to click on loggerin button");
		HighLightElements.drawBorder(getClickloggerin());
		WaitHelper.seleniumWait(getClickloggerin(), 30);
		CommonUtility.getJSClick(getClickloggerin());
		testresultdata.put("7",
				new Object[] { 1d, "User able to click on login button", "It Should displayed landing page", "Pass" });

	}

	public void getVerifyJackectPrice() {
		getlogin();
		logger.info("User able to mousehover over the men module");
		HighLightElements.drawBorder(getMenModule());
		WaitHelper.seleniumWait(getMenModule(), 30);
		CommonUtility.mouseHoverJScript(getMenModule());
		testresultdata.put("8", new Object[] { 1d, "User able to mousehover over the men module",
				"It Should displayed dropdown values", "Pass" });

		logger.info("User able to mousehover over the tops");
		HighLightElements.drawBorder(getSelectTops());
		WaitHelper.seleniumWait(getSelectTops(), 30);
		CommonUtility.mouseHoverJScript(getSelectTops());
		testresultdata.put("9", new Object[] { 1d, "User able to mousehover over the tops",
				"It Should displayed Jackets options", "Pass" });

		logger.info("User able to click on Jackets");
		HighLightElements.drawBorder(getSelectJacket());
		WaitHelper.seleniumWait(getSelectJacket(), 30);
		CommonUtility.getJSClick(getSelectJacket());
		testresultdata.put("10",
				new Object[] { 1d, "User able to click on Jackets", "It Should displayed Jackets page", "Pass" });

		logger.info("User able to click the Specific Jacket");
		HighLightElements.drawBorder(getSelectJupiterJacket());
		WaitHelper.seleniumWait(getSelectJupiterJacket(), 30);
		CommonUtility.getJSClick(getSelectJupiterJacket());
		testresultdata.put("11", new Object[] { 1d, "User able to click the Specific Jacket",
				"It Should displayed Jackets price and add to cart", "Pass" });

		logger.info("User able to verify the Specific Jacket");
		HighLightElements.drawBorder(getVerifiedJupiterJacket());
		WaitHelper.seleniumWait(getVerifiedJupiterJacket(), 30);
		String expected = prop.getProperty("Jacketname");
		String actual = getVerifiedJupiterJacket().getText();
		Assert.assertEquals(expected, actual);
		System.out.println(actual);
		testresultdata.put("12", new Object[] { 1d, "User able to verify the Specific Jacket",
				"It Should displayed Jackets name Jupiter All-Weather Trainer", "Pass" });

		logger.info("User able to select the size");
		HighLightElements.drawBorder(getSelectSize());
		WaitHelper.seleniumWait(getSelectSize(), 30);
		CommonUtility.getJSClick(getSelectSize());
		testresultdata.put("13",
				new Object[] { 1d, "User able to select the size", "It Should selected the size", "Pass" });

		logger.info("User able to select the color");
		HighLightElements.drawBorder(getSelectColor());
		WaitHelper.seleniumWait(getSelectColor(), 30);
		CommonUtility.getJSClick(getSelectColor());
		testresultdata.put("14",
				new Object[] { 1d, "User able to select the color", "It Should selected the color", "Pass" });

		logger.info("User able to select the quantity");
		HighLightElements.drawBorder(getSelectQuantity());
		WaitHelper.seleniumWait(getSelectQuantity(), 30);
		getSelectQuantity().clear();
		getSelectQuantity().sendKeys(prop.getProperty("QT"));
		testresultdata.put("15",
				new Object[] { 1d, "User able to select the quantity", "It Should selected the quantity", "Pass" });

		logger.info("User able to add to cart");
		HighLightElements.drawBorder(getAddToCart());
		WaitHelper.seleniumWait(getAddToCart(), 30);
		CommonUtility.getJSClick(getAddToCart());
		testresultdata.put("16",
				new Object[] { 1d, "User able to add to cart", "It Should displayed into card ", "Pass" });

		logger.info("User able to click on the shopping cart");
		HighLightElements.drawBorder(getClickOnShoppingCart());
		WaitHelper.seleniumWait(getClickOnShoppingCart(), 30);
		CommonUtility.getJSClick(getClickOnShoppingCart());
		testresultdata.put("17", new Object[] { 1d, "User able to click on the shopping cart",
				"It Should displayed proceed to checkout ", "Pass" });

		logger.info("User able to click on proceed to checkout");
		HighLightElements.drawBorder(getClickProceedToCart());
		WaitHelper.seleniumWait(getClickProceedToCart(), 30);
		CommonUtility.getJSClick(getClickProceedToCart());
		testresultdata.put("18", new Object[] { 1d, "User able to click on proceed to checkout",
				"It Should displayed shopping address page", "Pass" });

		logger.info("User able to click on new address");
		HighLightElements.drawBorder(getClickAddNewAddress());
		WaitHelper.seleniumWait(getClickAddNewAddress(), 30);
		CommonUtility.getJSClick(getClickAddNewAddress());
		testresultdata.put("19", new Object[] { 1d, "User able to click on new address",
				"It Should displayed shopping address dialog box", "Pass" });

	}

}
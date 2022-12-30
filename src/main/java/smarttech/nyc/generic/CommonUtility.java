package smarttech.nyc.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import smarttech.nyc.basepage.SupperClass;

public class CommonUtility extends SupperClass {


	public static void takeScreenshotAtEndOfTest() {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	// ====== for click purpose
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
	}

	// ====== for click purpose
	public static void getJSClick(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ele);
	}

	// ====== for continuously clicking purpose by looping
	@SuppressWarnings("unused")
	public static void clickUntilElementClickAble(WebElement element) {
		WebElement ele = element;
		for (int i = 0; i <= 299; i++) {
			ele.click();
			break;
		}

	}

	// ====== for verification
	public static void getAssert(String expected, String actual) {
		Assert.assertEquals(expected, actual);
		logger.info("Verified text" + actual);
		System.out.println("Verified text" + actual);
	}

	// ====== for mouse hover over
	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
	}

	// ====== for drop down
	public static void getSelectValue(WebElement ele, String text) {
		Select sc = new Select(ele);
		sc.selectByVisibleText(text);

	}

	// ====== for multiple webelements drop down
	public static void getSelectDropDownList(List<WebElement> ele, String text) {
		List<WebElement> option = ele;
		for (WebElement newValue : option) {
			if (newValue.getText().contains(text)) {
				newValue.click();
			}
		}
	}

	// ====== for scroll down
	public static void elementScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		// JavascriptExecutor executor = (JavascriptExecutor) driver;
		// executor.executeScript("arguments[0].scrollIntoView", element);
	}

	// ====== for scroll down
	public static void pageScrollDown() {
		Actions Magic = new Actions(driver);
		Magic.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	// ====== for radio button
	public static void getRadioButton(WebElement ele) {
		boolean sel = ele.isSelected();
		if (!sel) {
			ele.click();

		}

	}

	// ====== for generating random String
	public static String getNewAlphabetValue() {
		String data = RandomStringUtils.randomAlphabetic(6);
		// log.info(data);
		System.out.println(data);
		return data;

	}

	// ====== for generating random integer/number
	public static String getNewNumericValue() {
		String data = RandomStringUtils.randomNumeric(10);
		// log.info(data);
		System.out.println(data);
		return data;

	}

	public static void mouseHoverJScript(WebElement HoverElement) {
		try {
			if (isElementPresent(HoverElement)) {
				String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
				((JavascriptExecutor) driver).executeScript(mouseOverScript, HoverElement);
			} else {
				System.out.println("Element was not visible to hover " + "\n");
			}
		} catch (StaleElementReferenceException e) {
			System.out.println(
					"Element with " + HoverElement + "is not attached to the page document" + e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + HoverElement + " was not found in DOM" + e.getStackTrace());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while hovering" + e.getStackTrace());
		}
	}

	public static boolean isElementPresent(WebElement element) {
		boolean flag = false;
		try {
			if (element.isDisplayed() || element.isEnabled())
				flag = true;
		} catch (NoSuchElementException e) {
			flag = false;
		} catch (StaleElementReferenceException e) {
			flag = false;
		}
		return flag;
	}

}

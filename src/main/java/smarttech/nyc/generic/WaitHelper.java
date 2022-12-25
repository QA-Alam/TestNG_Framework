package smarttech.nyc.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import smarttech.nyc.basepage.SupperClass;

public class WaitHelper extends SupperClass {

	public static void seleniumWait(WebElement ele, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}



}

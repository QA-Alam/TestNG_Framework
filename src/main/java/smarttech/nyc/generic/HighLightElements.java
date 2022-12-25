package smarttech.nyc.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import smarttech.nyc.basepage.SupperClass;

public class HighLightElements extends SupperClass{
	
	
	
	public static void drawBorder(WebElement ele ){
      
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='6px solid yellow'", ele);
    }

}
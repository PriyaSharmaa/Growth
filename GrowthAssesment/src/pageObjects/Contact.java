package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact {

			
		private static WebElement element = null;
		
		 public static WebElement textbox_FirstName(WebDriver driver){
			
			 element = driver.findElement(By.name("firstname"));
			 waitForElementPresent(driver,element);
			 element.clear();
			 return element;
		 }
		
		public static WebElement textbox_LastName(WebDriver driver){
			 element = driver.findElement(By.name("lastname"));
			 waitForElementPresent(driver,element);
			 element.clear();
			 return element;
		 }
		
		public static WebElement textbox_Email(WebDriver driver){
			 element = driver.findElement(By.name("email"));
			 waitForElementPresent(driver,element);
			 element.clear();
			 return element;
		 }
		
		 public static void waitForElementPresent(WebDriver driver,  WebElement webelement) {
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOf(webelement));	
			}

	}


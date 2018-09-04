package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import library.Library;
import pageObjects.Contact;

public class GrowthAssess {
	
	private static WebDriver driver = null;
	
	@BeforeSuite
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\GrowthAssesment\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get(" http://www.growthengineering.co.uk/");
		 driver.manage().window().maximize();
	}
	 
	       
	@Test(priority=1)	
	public void  top_navigation_menu_links() throws InterruptedException
	{
	 
	       //Solutions
		
	        WebElement solutions = driver.findElement(By.xpath("//span[contains(text(),'Solutions')]"));
	 
	        Actions action = new Actions(driver);
	 
	        action.moveToElement(solutions).build().perform();
	        
	        WebElement solutionsub1 = driver.findElement( By.xpath("//span[contains(text(),'The Academy LMS')]"));
	        waitForElementPresent(driver,solutionsub1);
	        solutionsub1.click();
	       
	        WebElement solutionsub2 = driver.findElement(By.xpath("//span[contains(text(),'Genie – a Game-Based Content Authoring Tool')]"));
	        waitForElementPresent(driver,solutionsub2);
	        solutionsub2.click();
	       
	        WebElement solutionsub3 = driver.findElement(By.xpath("//span[contains(text(),'The Knowledge Arcade Mobile App')]"));
	        waitForElementPresent(driver,solutionsub3);
	        solutionsub3.click();
	       
	        WebElement solutionsub4 = driver.findElement(By.xpath("//span[contains(text(),'Custom Online Learning')]"));
	        waitForElementPresent(driver,solutionsub4);
	        solutionsub4.click();
	        
	       //learner Engagement 
	        WebElement learnerEngagement = driver.findElement(By.xpath("//span[contains(text(),'Learner Engagement')]"));
	   	 
	        Actions learneraction = new Actions(driver);
	 
	        learneraction.moveToElement(learnerEngagement).build().perform();
	        
	        WebElement learnersub1 = driver.findElement( By.xpath("//span[contains(text(),'Gamification')]"));
	        waitForElementPresent(driver,learnersub1);
	        learnersub1.click();
	       
	        WebElement learnersub2 = driver.findElement(By.xpath("//span[contains(text(),'Social Learning')]"));
	        waitForElementPresent(driver,learnersub2);
	        learnersub2.click();
	       
	        WebElement learnersub3 = driver.findElement(By.xpath("//span[contains(text(),'Epic Meaning')]"));
	        waitForElementPresent(driver,learnersub3);
	        learnersub3.click();
	       
	        WebElement learnersub4 = driver.findElement(By.xpath("//span[contains(text(),'Mobile Learning')]"));
	        waitForElementPresent(driver,learnersub4);
	        learnersub4.click();
	        
	        //Success Stories
	        
	        WebElement successStories = driver.findElement(By.xpath("//span[contains(text(),'Success Stories')]"));
		   	 
	        Actions successaction = new Actions(driver);
	 
	        successaction.moveToElement(successStories).click().build().perform();
	        
	        WebElement successsub1 = driver.findElement( By.xpath("//span[contains(text(),'Our Clients')]"));
	        waitForElementPresent(driver,successsub1);
	        successsub1.click();
	       
	        WebElement successsub2 = driver.findElement(By.xpath("//span[contains(text(),'Award-Winning')]"));
	        waitForElementPresent(driver,successsub2);
	        successsub2.click();
	        
	        
	        //Resources
	        WebElement resourcesStories = driver.findElement(By.xpath("//span[contains(text(),'Resources')]"));
		   	 
	        Actions resourcesaction = new Actions(driver);
	 
	        resourcesaction.moveToElement(resourcesStories).click().build().perform();
	        
	        WebElement resourcessub1 = driver.findElement( By.xpath("//span[contains(text(),'GE TV')]"));
	        waitForElementPresent(driver,resourcessub1);
	        resourcessub1.click();
	       
	        WebElement resourcessub2 = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
	        waitForElementPresent(driver,resourcessub2);
	        resourcessub2.click();
	       
	        WebElement resourcessub3 = driver.findElement(By.xpath("//span[contains(text(),'Blog')]"));
	        waitForElementPresent(driver,resourcessub3);
	        resourcessub3.click();
	       
	        WebElement resourcessub4 = driver.findElement(By.xpath("//span[contains(text(),'Webinars')]"));
	        waitForElementPresent(driver,resourcessub4);
	        resourcessub4.click();
	        
	        
	        //About Us
	        WebElement aboutUsStories = driver.findElement(By.xpath("//span[contains(text(),'About Us')]"));
		   	 
	        Actions  aboutUsaction = new Actions(driver);
	 
	        aboutUsaction.moveToElement(aboutUsStories).click().build().perform();
	        
	        WebElement aboutUsactionsub1 = driver.findElement( By.xpath("//span[contains(text(),'Our Origin Story')]"));
	        waitForElementPresent(driver,aboutUsactionsub1);
	        aboutUsactionsub1.click();
	       
	        WebElement aboutUsactionsub2 = driver.findElement(By.xpath("//span[contains(text(),'Careers')]"));
	        waitForElementPresent(driver,aboutUsactionsub2);
	        aboutUsactionsub2.click();
	       
	        WebElement aboutUsactionsub3 = driver.findElement(By.xpath("//span[contains(text(),'GDPR')]"));
	        waitForElementPresent(driver,aboutUsactionsub3);
	        aboutUsactionsub3.click();
	        
	        //Get in Touch
	        
	        WebElement GetinTouch = driver.findElement(By.xpath("//span[contains(text(),'Get in Touch')]"));
		   	 
	        Actions GetinTouchaction = new Actions(driver);
	 
	        GetinTouchaction.moveToElement(GetinTouch).click().build().perform();
	        
	      
	 }
	
	@Test(priority=1)	
	public void contactUs_with_valid_value() throws InterruptedException
	{
		WebElement GetinTouch = driver.findElement(By.xpath("//span[contains(text(),'Get in Touch')]"));
	   	 
        Actions GetinTouchaction = new Actions(driver);
 
        GetinTouchaction.moveToElement(GetinTouch).click().build().perform();
	
		Library.setText(Contact.textbox_FirstName(driver), "Priyanka");
		Library.setText(Contact.textbox_LastName(driver), "Sharma");
		Library.setText(Contact.textbox_Email(driver), "Pri.webworld@gmail.com");
		WebElement Textarea = driver.findElement(By.name("what_s_your_goal_"));
		Textarea.sendKeys(" ");
		WebElement button = driver.findElement(By.cssSelector("hs-button primary large"));
		button.submit();
		
		
	}   
	
	@Test(priority=2)	
	public void contactUs_with_Invalid_value() throws InterruptedException
	{
		
		WebElement GetinTouch = driver.findElement(By.xpath("//span[contains(text(),'Get in Touch')]"));
	   	 
        Actions GetinTouchaction = new Actions(driver);
 
        GetinTouchaction.moveToElement(GetinTouch).click().build().perform();
		Library.setText(Contact.textbox_FirstName(driver), "");
		Library.setText(Contact.textbox_LastName(driver), "");
		Library.setText(Contact.textbox_Email(driver), "Pri.webworld");
		WebElement Textarea = driver.findElement(By.name("what_s_your_goal_"));
		Textarea.clear();
		Textarea.sendKeys("product queries");
		WebElement button = driver.findElement(By.cssSelector("hs-button primary large"));
		button.submit();
	}
	
	
	
	
	   public static void waitForElementPresent(WebDriver driver,  WebElement webelement) {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(webelement));	
		}
	   
	   @AfterSuite
		public void cleanUp()
		{
			driver.close();
		}

	}

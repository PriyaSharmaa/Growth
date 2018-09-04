package library;

import org.openqa.selenium.WebElement;

public class Library {
		
		public static void setText(WebElement element,String sText)
		{
			try
			{
				if(sText != "")
				{
					element.clear();
					element.sendKeys(sText);
					System.out.println("Set Text Performed on Element : " + element.toString() + "with Value : " + sText );
				}
				else
				{
					System.out.println("SetText is not performed because value is empty");
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception occur in SetText : " + e.toString());
				System.out.println("Exception Message : " + e.getMessage());
				System.out.println("Exception StackTrace : " + e.getStackTrace());
			}
			finally
			{
				System.out.println("SetText is Ending on Element : " + element.toString() + "with Value : " + sText );
			}
			
			
		}

		
		//write a method which will read and return the property key value
		
		public static String readPropertyFile(String pathofFile, String Key)
		{
			String value = "";
			return value;
		}
	}



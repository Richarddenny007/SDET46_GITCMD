package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_Utilities.Generic_methods;
import Generic_Utilities.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCcricket {

	@Test
	public static void cricket() throws InterruptedException
	{
		
		SeleniumUtility sel=new SeleniumUtility();
		WebDriver driver = sel.openBrowser(System.getProperty("browser"));
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/homepage");
		
		
		
		
		
		
		
	
	}

}

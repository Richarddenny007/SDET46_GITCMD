package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic_Utilities.SeleniumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart 

{
	@Test
public static void fip()
{
	SeleniumUtility sel=new SeleniumUtility();
	WebDriver driver = sel.openBrowser(System.getProperty("browser"));
	driver.get("https://www.amazon.com");
	
	
}
	
}

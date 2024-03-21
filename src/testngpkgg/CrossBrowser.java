package testngpkgg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
WebDriver driver;
String url="https://www.facebook.com/";
@Parameters({"browsers"})
@BeforeTest
public void setup(String browsers)
{ 
	if(browsers.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	else if(browsers.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		
	}
	else
	{
		driver=new EdgeDriver();
		
	}
}
	@Test
	public void testcross()
	{
		driver.get(url);
	}
	


}

package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagepackage.FBCreatePage;


public class FBCreatePageTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
}
	@Test
	public void test()
	{
		FBCreatePage ob=new FBCreatePage(driver);
		ob.createPage();
		String actualtitle=ob.titleVerification();
		Assert.assertEquals(actualtitle,"Facebook");
		ob.signupPage();
		
	}

}

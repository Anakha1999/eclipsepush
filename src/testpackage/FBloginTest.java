package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.FBloginPage;

public class FBloginTest {
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
	FBloginPage ob=new FBloginPage(driver);
	ob.setvalues("abc123@gmail.com", "abxg123^&");
	ob.login();
}

}

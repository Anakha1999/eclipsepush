package testngpkgg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JustDailDisableNotfn {
	ChromeDriver driver;
	String url="https://www.justdial.com/";
	@BeforeTest
	public void setup()
	{
		
			ChromeOptions ops=new ChromeOptions();
			ops.addArguments("--disable-notifications");
			driver=new ChromeDriver(ops);
		
}
	@Test
	public void justDial()
	{
		driver.get(url);
		
	}
	}



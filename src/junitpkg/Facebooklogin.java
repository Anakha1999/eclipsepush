package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	ChromeDriver driver;
	String url="https://www.facebook.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("abcd@gamil.com");
		driver.findElement(By.name("pass")).sendKeys("abcd@#");
		driver.findElement(By.name("login")).click();
		
	}
	

}

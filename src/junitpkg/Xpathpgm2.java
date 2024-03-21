package junitpkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm2 {
	ChromeDriver driver;
	String url="https://www.instagram.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void instaLogin()
	{
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abcd@gamil.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("abc");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).submit();		


		
		
	}
}

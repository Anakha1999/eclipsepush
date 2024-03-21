package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearchh {
	ChromeDriver driver;
	String url="https://www.google.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void googleSearch()
	{
	WebElement search=driver.findElement(By.xpath("//textarea[@name='q']"));
	//search.sendKeys("amazon",Keys.ENTER);
	search.sendKeys("amazon");
	search.submit();
		
	}

}

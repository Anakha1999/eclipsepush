package junitpkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathprgm {
	ChromeDriver driver;
	String url="https://www.facebook.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void fbLogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@gamil.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
}

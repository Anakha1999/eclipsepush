package testngpkgg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPhones {
	ChromeDriver driver;
	String url="https://www.amazon.in/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();		
}
	@Test
	public void amazonTest()
	{
		driver.get(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("mobiles");
		search.submit();
		String expected="Amazon.in: mobiles";
		String actual=driver.getTitle();
		if(expected.equalsIgnoreCase(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("failed");
		}
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		mobile.click();
		String parent=driver.getWindowHandle();
		Set<String> Allwindows=driver.getWindowHandles();
		for(String handles:Allwindows)
		{
			if(!handles.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(handles);
				
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				
				
				
			}
	
	//driver.switchTo().window(parent);
		
	}

}
}

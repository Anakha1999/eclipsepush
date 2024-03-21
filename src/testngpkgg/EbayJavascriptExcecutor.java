package testngpkgg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbayJavascriptExcecutor {
	ChromeDriver driver;
	String url="https://www.ebay.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
		
}
	@Test
	public void ebayClick()
	{
		WebElement element=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/h3/a"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		element.click();
	}
	}


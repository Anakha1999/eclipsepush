package testngpkgg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CurrentURL {
	ChromeDriver driver;
	String url="https://automationexercise.com/login";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void signup()
	{
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys("Anakha Paroor");
		WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("anakha.paroor1999@gmail.com");
		WebElement signup=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signup.click();
		String expectedurl="https://automationexercise.com/login";
		String actualurl=driver.getCurrentUrl();
		System.out.println("current url="+actualurl);
		if(expectedurl.equals(actualurl))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("incorrect url");
		}
	}

}

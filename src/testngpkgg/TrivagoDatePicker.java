package testngpkgg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoDatePicker {
	ChromeDriver driver;
	String url="https://www.trivago.in/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void datePicker() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();	
		
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[1]/fieldset/button[1]/span")).click();;
		
	}

}

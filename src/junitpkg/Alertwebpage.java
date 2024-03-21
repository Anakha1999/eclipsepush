package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwebpage {
	ChromeDriver driver;
	String url="file:///D:/Anakha%20Paroor/alert%20webpage.html";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	@Test
	public void alertt()
	{
		WebElement alertBox=driver.findElement(By.xpath("//input[@type='button']"));
		alertBox.click();
		Alert a=driver.switchTo().alert();
		String textt=a.getText();
		System.out.println(textt);
		a.accept(); //to accept alert
		//a.dismiss(); //to cancel alert
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("anakha");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("paroor");
		WebElement submitt=driver.findElement(By.xpath("//input[@value='submit']"));
		submitt.click();
		
	}

}

package testngpkgg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
	ChromeDriver driver;
	String url="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test(priority=1)
	public void actionss()
	{
		WebElement amount1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement accountdebit=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement amountdebit=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(amount1,amountdebit);
		act.dragAndDrop(bank,accountdebit);
		act.perform();
		
		WebElement amount2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement accountcredit=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement amountcredit=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		act.dragAndDrop(amount2,amountcredit);
		act.dragAndDrop(sales,accountcredit);
		act.perform();
		
	
		}
	@Test(priority=2)
	public void perfect()
	{
		WebElement perfectt=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if(perfectt.isDisplayed())
		{
			System.out.println(" 'perfect' is displayed");
		}
		else
		{
			System.out.println(" 'perfect' is not displayed");
		}
	}
}

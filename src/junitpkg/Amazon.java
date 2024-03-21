package junitpkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	String url="https://www.amazon.in";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazon()
	{
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobiles");
	search.submit();
	WebElement bestsellers=driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
	bestsellers.click();
	WebElement signin=driver.findElement(By.xpath("//div[@id='nav-tools']/a/div/span"));
	signin.click();
	driver.navigate().back();  //go back to previous page
	WebElement cart=driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]/div/span"));
	cart.click();
	driver.navigate().back();
	WebElement menu=driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	menu.click();
		
	}
}

package testngpkgg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetwindowHandle {
	ChromeDriver driver;
	String url="https://demo.guru99.com/popup.php";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
}
	@Test
	public void windowHandles()
	{
		driver.get(url);
	    String parent=driver.getWindowHandle();
		System.out.println("Title=" +driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> Allwindows=driver.getWindowHandles();
		for(String handles:Allwindows)
		{
			if(!handles.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(handles);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				driver.close();
	
			}
			driver.switchTo().window(parent);
		}
		
	}
}

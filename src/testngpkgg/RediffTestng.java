package testngpkgg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RediffTestng {
	ChromeDriver driver;
	String url="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test(priority=1)
	public void titleVerification()
	{
		String expected="Rediffmail Free Unlimited Storage";
		String actual=driver.getTitle();
		if(expected.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test(priority=2)
	public void logoDisplayed()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@src='/register/pix/redifflogo1.gif']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		
	}
	@Test(priority=3)
	public void labelVerification()     // or simply done using getPageSource() 
	{
		WebElement fullname=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[1]"));
		String s=fullname.getText();
		if(s.contains("Full Name"))
		{
			System.out.println("full name lable is present");
		}
		else
		{
			System.out.println("full name label is not present");
		}
	}
	@Test(priority=5)
	public void buttonTextVerification()
	{
		WebElement submitbutton=driver.findElement(By.xpath("//input[@value='Create my account >>']"));
		String txt=submitbutton.getAttribute("value");
		if(txt.contains("Create my account >>"))
		{
			System.out.println("submit button text-'Create my acoount >>' is present");
		}
		else
		{
			System.out.println("submit button text-'Create my acoount >>' is not present");
		}	
		
	}
	@Test(priority=4)
	public void buttonEnabled()
	{
		WebElement button=driver.findElement(By.xpath("//input[@value='Create my account >>']"));
		if(button.isEnabled())
		{
			System.out.println("submit button is enabled");
		}
		else
		{
			System.out.println("submit button is disabled");
		}
	}

}

package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedifLogo {
ChromeDriver driver;
String url="https://register.rediff.com/register/register.php?FormName=user_details";

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
	
}

@Test
public void logoTest()
{
	//WebElement logo=driver.findElement(By.cssSelector("img[src='/register/pix/redifflogo1.gif']"));
	WebElement logo=driver.findElement(By.xpath("//img[@src='/register/pix/redifflogo1.gif']"));
	if(logo.isDisplayed())
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is not present");
	}
	WebElement radiomale=driver.findElement(By.xpath("//input[@value='m']"));
	boolean value=radiomale.isSelected();
	if(value)
	{
		System.out.println("radio buttom is selected for male by default");
	}
	else
	{
		System.out.println("radio buttom is not selected for male by default");
	}
	
}
}
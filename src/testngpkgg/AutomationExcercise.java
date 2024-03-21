package testngpkgg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExcercise {
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
		name.sendKeys("Anakha");
		
		WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("anakha.rajendran07@gmail.com");
		
		WebElement signup=driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signup.click();
		
		WebElement title=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		title.click();
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Anakha123**");
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("14");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("8");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByVisibleText("1999");
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		checkbox.click();
		
		WebElement fname=driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		fname.sendKeys("Anakha");
		
		WebElement lname=driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lname.sendKeys("Paroor");
		
		WebElement company=driver.findElement(By.xpath("//*[@id=\"company\"]"));
		company.sendKeys("Paroor company");
		
		WebElement address=driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address.sendKeys("Paroor(H) Edakulam PO Ranni,PTA");
		
		WebElement address2=driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		address2.sendKeys("Paroor(H) Edakulam PO Ranni,PTA");
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select countrydetails=new Select(country);
		countrydetails.selectByVisibleText("India");
		
		WebElement state=driver.findElement(By.xpath("//*[@id=\"state\"]"));
		state.sendKeys("Kerala");
		
		WebElement city=driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("Ranni");
		
		WebElement zcode=driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
		zcode.sendKeys("689672");
			
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
		mobile.sendKeys("9672234512");
		
		WebElement submitbutton=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
		submitbutton.submit();
			
	}

}

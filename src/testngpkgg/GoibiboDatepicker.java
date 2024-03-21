package testngpkgg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoibiboDatepicker {
	
	
	ChromeDriver driver;
	String url="https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQiA84CvBhCaARIsAMkAvkIcPwUnIahMoOaRmWqUmpIt7Kgw-zsbSjeXtCCPeDMtc88W60bgdfoaAjv_EALw_wcB";
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
		
		WebElement departure=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div"));
		departure.click();
		
		while(true)
		{
			//Thread.sleep(1000);
			WebElement month=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
			String mon=month.getText();
			System.out.println(mon);
			if(mon.equals("August 2024"))
			{
				break;
			}
			else
			{
				WebElement gotonext=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]"));
				gotonext.click();
			}
		}
		List <WebElement> li=driver.findElements(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/div/div"));
		for(WebElement ele:li)
		{
			String date=ele.getText();
			if(date.equals("14"))
			{
				ele.click();
			}
			
			
		}
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span")).click();
	}

}

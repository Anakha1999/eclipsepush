package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksVerfication {
	ChromeDriver driver;
	String url="https://www.google.co.in/";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(url);	
	}
	@Test
	public void linkvalidation()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement ele:li)
		{
			String links=ele.getAttribute("href");
			verify(links);
		}
	}
	private void verify(String links) {
		
			
		try {
			URL u=new URL(links);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("response code is 200-> successfull");
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("response code is 404-> page broken");
			}
			else
			{
				System.out.println("not expected");
			}
		}
		 catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	

}

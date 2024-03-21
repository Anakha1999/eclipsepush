package junitpkg;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	ChromeDriver driver;
	String url="https://janasya.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	@Test
	public void janasyaaa()
	{
		String expected="janasya";
		String actual=driver.getTitle();
		
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		WebElement newarrivals=driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a/span"));
		newarrivals.click();
		WebElement categories=driver.findElement(By.xpath("//div[@class='sidebarBlock sidebar-categories sidebarBlock-collapse']/div[1]/h3"));
		categories.click();
		WebElement kurtas=driver.findElement(By.xpath("//div[@class='sidebarBlock sidebar-categories sidebarBlock-collapse']/div[2]/div/ul/li[1]/a/span"));
		kurtas.click();
		
		WebElement searchbar=driver.findElement(By.xpath("//form[@action='/search']/div[1]/input[1]"));
		searchbar.sendKeys("kurtis");
		searchbar.submit();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
//		for(WebElement e:links)
//		{
////			String elements=e.getAttribute("href");
////			String texts=e.getText();
////			System.out.println(elements+ "---"+texts);		
//		}
//		
	
	}
}

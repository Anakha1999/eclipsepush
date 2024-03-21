package junitpkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Junitpgm1 {
	ChromeDriver driver;
	String url="https://www.facebook.com/";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Test
	public void titleverification()
	{
		String expected="facebook";
		String actual=driver.getTitle();
		
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void pageSource()
	{
		String src=driver.getPageSource();
		String wrd="username";
		if(src.contains(wrd))
		{
			System.out.println("present,pass");
		}
		else
		{
			System.out.println("not present,failed");
		}
		
	}
	@After
	public void shutDown()
	{
		driver.quit();
	}
	

}

package junitpkg;

import java.io.File;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FbScreenshot {
ChromeDriver driver;
String url="https://www.facebook.com/";
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void fbScreenshot() throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileHandler.copy(src, new File("D://fbscreenshot.png"));
	FileHandler.copy(src, new File("D://Anakha Paroor/fb.png"));
	
	WebElement login=driver.findElement(By.name("login"));
	File src1=login.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,new File("./screenshots/fbloginbutton.png"));
}
}

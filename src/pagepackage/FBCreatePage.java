package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class FBCreatePage {
	WebDriver driver;
 By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
 By signup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");

public FBCreatePage(WebDriver driver)
{
	this.driver=driver;
	

}
public void createPage()
{
	driver.findElement(createpage).click();
	
}
public String titleVerification()
{
	
	String title=driver.getTitle();
	return title;
	
}
public void signupPage()
{
	driver.findElement(signup).click();
	
}

}

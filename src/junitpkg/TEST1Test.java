package junitpkg;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TEST1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1() {
    driver.get("https://www.google.co.in/search?q=books&sca_esv=673643cfd9d73a9d&source=hp&ei=zCLvZa2WJ76kvr0P26ei4A8&iflsig=ANes7DEAAAAAZe8w3Aqb8O4Rg8LjkwX3e4Bbuvjt4K_g&ved=0ahUKEwitrPzlwuyEAxU-kq8BHduTCPwQ4dUDCBY&uact=5&oq=books&gs_lp=Egdnd3Mtd2l6IgVib29rczIIEAAYgAQYsQMyCBAAGIAEGLEDMgsQLhiABBixAxjUAjIIEAAYgAQYsQMyERAuGIAEGLEDGIMBGMcBGK8BMgUQABiABDILEC4YgAQYsQMYgwEyCBAAGIAEGLEDMgUQABiABDIIEAAYgAQYsQNI_RdQAFjQFHABeACQAQCYAfsBoAG0CKoBBTAuNC4yuAEDyAEA-AEBmAIHoAL7CKgCCsICCxAAGIAEGLEDGIMBwgIREC4YgwEYxwEYsQMY0QMYgATCAg4QABiABBiKBRixAxiDAcICBRAuGIAEwgIIEC4YgAQYsQPCAhAQABgDGI8BGOUCGOoCGIwDwgIOEC4YgAQYigUYsQMYgwHCAgsQLhiABBjHARjRA8ICCxAAGIAEGLEDGMkDwgIOEAAYgAQYsQMYgwEYkgPCAgsQABiABBiKBRiSA8ICCBAAGIAEGJIDwgIOEC4YgAQYsQMYxwEY0QOYAweSBwUxLjQuMqAH6D0&sclient=gws-wiz");
    driver.manage().window().setSize(new Dimension(1258, 680));
    {
      WebElement element = driver.findElement(By.linkText("Google Search Help"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("dimg_11"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.id("dimg_11"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}

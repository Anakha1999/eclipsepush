package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String url="https://www.google.com";
		driver.get(url);
		String src=driver.getPageSource();
		String word="Gmail";
		if(src.contains(word))
		{
			System.out.println("Gmail is present,pass");
		}
		else
		{
			System.out.println("Gmail is not present, fail");
		}
		driver.quit();
	}

}

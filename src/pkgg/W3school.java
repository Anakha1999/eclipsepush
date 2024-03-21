package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		String url="https://www.w3schools.com/";
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		String wrd="python";
		if(src.contains(wrd))
		{
			System.out.println("python is present");
		}
		else
		{
			System.out.println("python is not present");
		}
		driver.quit();
		

	}

}

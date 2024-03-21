package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); //to launch chrome 
		driver.get("https://www.google.com"); // to load url
		String expected="Google"; //expected title
		System.out.println("Expected title= " +expected);
		String actual= driver.getTitle();  //actual title -getTitle() returns actual title
		System.out.println("Actual title= "+actual);
		if(expected.equals(actual))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("failed");
		}
		driver.quit(); //quit() closes the entire browser and close() closes only one tab
	}

}

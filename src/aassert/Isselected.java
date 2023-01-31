package aassert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.w3schools.com/sql/");
		 
		 

	}

}

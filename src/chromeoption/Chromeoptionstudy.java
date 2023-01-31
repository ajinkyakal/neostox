package chromeoption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionstudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt= new ChromeOptions();
		
	 // opt.addArguments("--headless");
		
		opt.addArguments("--incognito");
		opt.addArguments("--start-maximized");
		opt.addArguments("--disable-infobars");

		
		WebDriver driver= new ChromeDriver(opt);
		
		
		
		driver.get("http://output.jsbin.com/osebed/2");
		Thread.sleep(1000);
		
		 String fruits = driver.findElement(By.id("fruits")).getText();

		System.out.println(fruits);
		
		driver.quit();
	}

}

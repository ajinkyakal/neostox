package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
         System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		 Thread.sleep(400);
		 
		 driver.switchTo().frame("frame1");
		 Thread.sleep(400);
		 
		 
		 driver.findElement(By.xpath("//input")).sendKeys("ajinkya kaledmkffe");
		 Thread.sleep(400);
		 
		////click  box of child page   to main page text
		 driver.switchTo().frame("frame3");
		 Thread.sleep(400);
		 
		 driver.findElement(By.id("a")).click();
		 Thread.sleep(400);
		 
		 driver.switchTo().defaultContent();
		 String text1 = driver.findElement(By.xpath("//label")).getText();
	System.out.println("text on main page"+text1);
		
		
		//// drop box child page to main page text
		
		driver.switchTo().frame("frame2");
		WebElement Animals = driver.findElement(By.id("animals"));
		 
		Select S= new Select(Animals);
		S.selectByValue("cat");
		
		
		 driver.switchTo().defaultContent();
		 String text2 = driver.findElement(By.xpath("//label")).getText();
		 System.out.println("text on main page"+text2);
		 
		 
		
		

	}

}

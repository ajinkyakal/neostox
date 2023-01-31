package serialparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class facebook 
{
  @Test
  public void w3school() throws InterruptedException 
  {
	  

	 // System.setProperty("webdriver.gecko.driver", "D:\\ajinkya\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		// WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Reporter.log("facebook", true);
		 
		 Thread.sleep(700);
	  
	 
		 
  }
  
 
		 
  
}

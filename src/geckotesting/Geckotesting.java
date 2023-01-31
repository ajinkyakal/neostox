package geckotesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Geckotesting {
  @Test
  public void firefox() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\ajinkya\\geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://neostox.com/");
		 
		 Thread.sleep(500);
  }
}

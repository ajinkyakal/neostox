package testngstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng1program
{
  @Test
  public void neostoxtlounch() 
  {

		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://neostox.com/");
		 
		 System.out.println("it will not show in emailble report ");
		 
		 Reporter.log("this is printing statment .reporter is class and log is method .it will show in massage tab in emailble report but not in console ");
		 Reporter.log("it will show both place emailbe and console",true);
		 Reporter.log("it will show one place emailbe ",false);
  }

  @Test(invocationCount = 5)
  public void fblounch()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://neostox.com/");
  }
}

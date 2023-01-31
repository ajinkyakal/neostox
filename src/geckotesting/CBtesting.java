package geckotesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBtesting 
{
	
	@Parameters("browserName")
  
	@Test
  public void Cbtesting (String bName) 
	{
  
  WebDriver driver = null;
      
  {
		
	  if (bName.equals("Chrome"))
	         {
		  System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver.exe");
			
			  driver=new ChromeDriver();
			
        	  }	 
			 else if (bName.equals("Firefox"))
			 {
				 System.setProperty("webdriver.gecko.driver", "D:\\ajinkya\\geckodriver.exe");
					
				  driver=new FirefoxDriver();
				  
				  driver.manage().window().maximize();
				  driver.get("https://neostox.com/"); 
				
			 }
	    
	    
	  }
        
  }
}


package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screensht {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.w3schools.com/sql/");
		 
		 //Thread.sleep(100);
		String rnd = RandomString.make(5);
		 
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("F:\\shubham kakde\\testing"+rnd+".jpg");
		
		FileHandler.copy(Source, dest);

	}

}

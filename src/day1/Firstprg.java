package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprg 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/"); //get- to enter url in browser or to open an application
		
		//Thread.sleep(1000);  //to stop webpage for sec
		driver.get("paytm.com");
		
		driver.close(); //close: to close the current tab of the browser opened by Selenium tool
		
		

	}

}

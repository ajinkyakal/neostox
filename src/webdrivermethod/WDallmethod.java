package webdrivermethod;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDallmethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");//get- to enter url in browser or to open an application
	        //to stop webpage for sec
		
		//Thread.sleep(1000);
		
		
		//driver.navigate().to("https://web.whatsapp.com/");
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
	//	driver.navigate().back();
	//	driver.navigate().refresh();
	//	driver.navigate().forward();
		
		//driver.close(); //close: to close the current tab of the browser opened by Selenium tool
		
		//driver.quit();  //3. quit: to close the all the tabs present in browser opened by Selenium tool
		
	//	driver.manage().window().maximize();
		
	//	Thread.sleep(12000);
		
	//	driver.manage().window().minimize();

	}

}

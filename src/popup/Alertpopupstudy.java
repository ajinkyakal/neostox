package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopupstudy {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("submit")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		//alt.accept();
		
		//alt.accept();
		
		alt.dismiss();
		
		String text = driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).getText();
		
		System.out.println(text);
	}

}

package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Main page']")).click();
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}

}

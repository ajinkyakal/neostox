package neostox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostox
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://neostox.com/");
		 
		 Thread.sleep(500);
		 
		 
		 driver.findElement(By.id("lnk_toplinks_signin")).click();
		 
		 driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("9130830228");
		 
		 Thread.sleep(500);
		 driver.findElement(By.id("lnk_signup1")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("txt_accesspin")).sendKeys("9813");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//a[text()='Submit']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
		 Thread.sleep(2000);
		String name = driver.findElement(By.id("lbl_username")).getText();
		System.out.println(name);
		Thread.sleep(2000);
		driver.findElement(By.id("lbl_username")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("navbarSupportedContent")).click();
		

	}

}

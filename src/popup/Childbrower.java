package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Childbrower 
{

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();
		
		String mainPageID = driver.getWindowHandle();
		
     	System.out.println("Main page id "+mainPageID);
		
		Set<String> idsOfAllPages = driver.getWindowHandles();
		
		Iterator<String> it = idsOfAllPages.iterator();
		
		String mainPageIDnew = it.next();
		
		System.out.println(mainPageIDnew);
		
		String childPageID = it.next();//ID of child Page
		
	    System.out.println(childPageID);
		
		driver.switchTo().window(childPageID);
		
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(text);
		
		driver.switchTo().window(mainPageIDnew);
		
		driver.findElement(By.xpath("//a[text()='About us']")).click();
		
		Thread.sleep(2000);
		
		ChromeOptions opt= new ChromeOptions();
		
		opt.addArguments("--incognito");

		
		
		
		
		




		 

	}

}

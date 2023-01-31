package neostox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostoxwithexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		File myfile=new File("D:\\ajinkya\\ajkale.xls");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		 String username = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		//String expUN = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(username);
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("txt_accesspin")).sendKeys(password);
		driver.findElement(By.id("lnk_submitaccesspin")).click();




		


	}

}

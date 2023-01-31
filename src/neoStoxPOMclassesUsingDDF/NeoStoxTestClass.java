package neoStoxPOMclassesUsingDDF;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://neostox.com/");
		 
		//read data from excel
		 
		 File Myfile=new File("D:\\ajinkya\\ajkale.xls");
		 
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		 String mobnum=mysheet.getRow(0).getCell(0).getStringCellValue();
		 String password=mysheet.getRow(0).getCell(1).getStringCellValue();
		 String expectedusername=mysheet.getRow(0).getCell(2).getStringCellValue();
		 
		 Thread.sleep(500);

		 //hhomepage
		 NeoStoxHomePage home=new NeoStoxHomePage(driver);
		 home.clickonsignInButton();
		 
		 Thread.sleep(1000);
		 //signinpage
		 NeoStoxSignInPage signpage=new NeoStoxSignInPage(driver);
		 signpage.entermobilenum(mobnum);
		 signpage.clickonSignbutton();
		 
		 Thread.sleep(1500);
		 //passwordpage
		 Passwordpage pass=new Passwordpage(driver);
		 pass.enterpassword(password);
		 pass.clickonsubmitbotton();
		 
		 Thread.sleep(2000);
		 
		 //Maindashboardpage validate page
		 Maindashboardpage validateuserName=new Maindashboardpage (driver);
		 validateuserName.handdlepoppup();
		 Thread.sleep(3000);
		 validateuserName.getusername(expectedusername);
		 validateuserName.logout();
		 
		 driver.close();
	}

}

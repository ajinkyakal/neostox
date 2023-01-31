package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ajinkya\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://neostox.com/");
		 
		 Thread.sleep(500);

		 //hhomepage
		 NeoStoxHomePage home=new NeoStoxHomePage(driver);
		 home.clickonsignInButton();
		 
		 Thread.sleep(1000);
		 //signinpage
		 NeoStoxSignInPage signpage=new NeoStoxSignInPage(driver);
		 signpage.entermobilenum();
		 signpage.clickonSignbutton();
		 
		 Thread.sleep(1500);
		 //passwordpage
		 Passwordpage pass=new Passwordpage(driver);
		 pass.enterpassword();
		 pass.clickonsubmitbotton();
		 
		 Thread.sleep(2000);
		 
		 //Maindashboardpage validate page
		 Maindashboardpage validateuserName=new Maindashboardpage (driver);
		 validateuserName.handdlepoppup();
		 Thread.sleep(3000);
		 validateuserName.getusername();
		 validateuserName.logout();
		 
		 driver.close();
	}

}

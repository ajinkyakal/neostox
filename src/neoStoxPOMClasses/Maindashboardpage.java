package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maindashboardpage 
{

	@FindBy(xpath="(//a[text()='OK'])[2]")private WebElement hiddenpoppup;
	@FindBy(id="lbl_username")private WebElement actualusername;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
	
	public Maindashboardpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void handdlepoppup()
	{
		hiddenpoppup.click();
	}
	
	public void getusername()
	{
		String ExpextedUserName="Hi Ajinkya ale";
		String Actualusername = actualusername.getText();
		
		if (ExpextedUserName.equals(Actualusername))
		{
			System.out.println("TC is Passed, actual and expected user names are matching ");
		}
		
		else 
		{
			System.out.println("TC is Failed, actual and expected user names are not matching ");
		}
	}
	
	public void logout()
	
	{
		actualusername.click();
		logOutButton.click();
		
		
		
		System.out.println();
		
	}

}

package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxSignInPage 
{
  @FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumField;
  
  @FindBy(id="lnk_signup1")private WebElement signInbutton;
     
  public NeoStoxSignInPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void entermobilenum()
  {
	  mobileNumField.sendKeys("9130830228");
  }
  public void clickonSignbutton()
  {
	  signInbutton.click();
  }
}

package neoStoxPOMclassesUsingDDF;

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
  
  public void entermobilenum(String mobilenumberfromexel)
  {
	  mobileNumField.sendKeys(mobilenumberfromexel);
  }
  public void clickonSignbutton()
  {
	  signInbutton.click();
  }
}

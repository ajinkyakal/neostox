package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passwordpage 
{
  @FindBy(id="txt_accesspin")private WebElement passwordField;
  @FindBy(id="lnk_submitaccesspin")private WebElement Submitbotton;
  
  public Passwordpage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
  public void enterpassword()
  {
	  passwordField.sendKeys("9813");
  }
  
  public void clickonsubmitbotton()
  {
	  Submitbotton.click();
  }
}

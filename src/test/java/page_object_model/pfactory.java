package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pfactory {
	WebDriver driver = null;
	
      @FindBy(how= How.LINK_TEXT, using = "Log In") WebElement login;
      @FindBy(how= How.ID, using= "Email") WebElement uname; 
      @FindBy(how= How.ID, using= "password") WebElement pwd;
      @FindBy(how= How.XPATH, using= "//input[@value=\\\"Log in\\\"]") WebElement lbtn;
      
      public pfactory(WebDriver driver)
      {
    	this.driver = driver;  
      }
	
      public void loginmethod(String unam, String pass)
      {
    	  login.click();
    	  uname.sendKeys(unam);
    	  pwd.sendKeys(pass);
    	  lbtn.click();
    	  
      }

}

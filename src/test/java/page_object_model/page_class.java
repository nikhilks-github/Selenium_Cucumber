package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page_class {
	
	WebDriver driver = null;
	
	By lnc = By.linkText("Log in");
	By uname = By.id("Email");
	By pwd = By.id("Password"); 
	By lbtn = By.xpath("//input[@value=\"Log in\"]"); 
 

	public   page_class (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void  clk_lnk()

	{
		driver.findElement(lnc).click();
	}
	public void  typ_uname()

	{
		driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
	}
	public void  typ_pwd()

	{
		driver.findElement(pwd).sendKeys("aravind");
	}
	public void  clk_lbtn()

	{
		driver.findElement(lbtn).click();
	}

}

package page_object_model;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver = null;
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\a07208trng_b4b.04.25\\\\Desktop\\\\cucumber_training_nikhil\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://demowebshop.tricentis.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	   pfactory pf = PageFactory.initElements(driver, pfactory.class);
	  
	
	  
  }
}

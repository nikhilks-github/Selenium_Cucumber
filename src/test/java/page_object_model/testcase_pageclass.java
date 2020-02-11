package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase_pageclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\cucumber_training_nikhil\\chromedriver_win32 (3)\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com/");
		   driver.manage().window().maximize();
		page_class obj = new page_class(driver);
		obj.clk_lnk();
		obj.typ_uname();
		obj.typ_pwd();
		obj.clk_lbtn();
		

	}

}

package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demo1_stepDef {

	WebDriver driver = null; 
	@Given("^the login page is opened$")
	public void the_login_page_is_opened() throws Throwable {

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\cucumber_training_nikhil\\chromedriver_win32 (3)\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("http://demowebshop.tricentis.com/");
			  driver.manage().window().maximize();
			  driver.findElement(By.linkText("Log in")).click();
	}

	@When("^user enters aravind\\.guggila(\\d+)@gmail\\.com as username$")
	public void user_enters_aravind_guggila_gmail_com_as_username(int arg1) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	}

	@When("^user enters aravind as password$")
	public void user_enters_aravind_as_password() throws Throwable {
		  driver.findElement(By.id("Password")).sendKeys("aravind");
	}

	@Then("^user wil click on login button$")
	public void user_wil_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

	@Then("^demo webshop home page appears$")
	public void demo_webshop_home_page_appears() throws Throwable {
	    System.out.println("tilte of the page is" +driver.getTitle());
	}


}

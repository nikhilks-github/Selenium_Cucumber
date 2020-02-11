package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_stepDef {
	
	WebDriver driver = null;
	@Given("^Register page is opened$")
	public void register_page_is_opened() throws Throwable {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\cucumber_training_nikhil\\chromedriver_win32 (3)\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Register")).click();
	}

	@When("^User Clicks on the radio button male or female$")
	public void user_Clicks_on_the_radio_button_male_or_female() throws Throwable {
	    driver.findElement(By.id("gender-male")).click();
	}

	@When("^User enters the firstname$")
	public void user_enters_the_firstname() throws Throwable {
	   driver.findElement(By.id("FirstName")).sendKeys("test-nik1");
	}

	@When("^User enters the last name$")
	public void user_enters_the_last_name() throws Throwable {
		 driver.findElement(By.id("LastName")).sendKeys("test-ks1");
	}
	

	@When("^User enters the email$")
	public void user_enters_the_email() throws Throwable {
	driver.findElement(By.id("Email")).sendKeys("testmail341@gmail.com");
	}
	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
	    driver.findElement(By.id("Password")).sendKeys("1qaz@WSX");
	}

	@When("^User enters confirm password$")
	public void user_enters_confirm_password() throws Throwable {
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1qaz@WSX");
	}

	@Then("^User clicks on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		driver.findElement(By.id("register-button")).click();
	}

	@Then("^Registration complete should be displayed$")
	public void registration_complete_should_be_displayed() throws Throwable {
	   System.out.println("completed");
	}
	
}


package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Parameterization_stepDef {
	WebDriver driver = null;
	

@Given("^User opens the application$")
public void user_opens_the_application() throws Throwable {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\cucumber_training_nikhil\\chromedriver_win32 (3)\\chromedriver.exe");
   driver = new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  
}

@When("^User clicks to signin link$")
public void user_clicks_to_signin_link() throws Throwable {
	driver.findElement(By.linkText("Log in")).click();
}

@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	driver.findElement(By.id("Email")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(password);
   
}

@Then("^User clicks on login$")
public void user_clicks_on_login() throws Throwable {
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
}

@Then("^Demo Web Shop home page should display$")
public void demo_Web_Shop_home_page_should_display() throws Throwable {
	   System.out.println("tilte of the page is" + driver.getTitle());
}
}

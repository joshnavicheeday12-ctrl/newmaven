package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	WebDriver driver;
	
	@Given("chrome browser is open")
	public void chrome_browser_is_open() {
		
	    // Write code here that turns the phrase above into concrete actions
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.get("https://www.saucedemo.com/");
	    Thread.sleep(2000);
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_joshu_and(String username, String password) throws InterruptedException {
		
	    // Write code here that turns the phrase above into concrete actions
		
	    driver.findElement(By.id("user-name")).sendKeys(username);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("password")).sendKeys(password);
	    Thread.sleep(2000);
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("login-button")).click();
	}
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		// Write code here that turns the phrase above into concrete actions
		
		driver.quit();	
	}
	
}

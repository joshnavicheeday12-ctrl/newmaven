package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class googlesearch {
	
	WebDriver driver;
	
	// Step 1: Open the browser
	@Given("browser is open")
	public void givenBrowserIsOpen() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	// Step 2: Navigate to Google search page
	@Given("user is on google search page")
	public void givenUserIsOnGoogleSearchPage() {
		driver.navigate().to("https://www.google.com");
	}
	
	// Step 3: Enter text in the search box and press ENTER
	@When("user enters a text in search box")
	public void whenUserEntersTextInSearchBox() {
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	// Step 4: Verify user is on the search results page
	@Then("user is navigated to search results")
	public void thenUserIsNavigatedToSerchResults() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit(); // Close the browser
	}

}

package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest  extends Hooks {
	
	
	@Given("User is on google page is {string}")
	public void user_is_on_google_page(String url) {
	    Hooks.driver.get(url);
	    
	}

	@When("User enter text {string} search page")
	public void user_enter_search_page(String value) {
	    Hooks.driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(value);
	}

	@When("User press enter button") 
	public void user_press_enter_button() {
	Hooks.driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys(Keys.ENTER);
	
	}

	@Then("validate the title of the page is {string}")
	public void validate_the_title_of_the_page(String value) {
		System.out.println(Hooks.driver.getTitle());
		//org.testng.Assert.assertEquals(Hooks.driver.getTitle(), value);
	    
	}

}

package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import objects.GoogleHomePage;

public class Actions extends GoogleHomePage{
	
	public static WebDriver driver;
	
	Actions s=PageFactory.initElements(driver, Actions.class);
	
	public void googleHomeSearch () {	
		s.searchTab.sendKeys("Selenium");
		
	}
	
	public void googleSearchEnter() {
		s.searchTab.sendKeys(Keys.ENTER);
		
	}

}

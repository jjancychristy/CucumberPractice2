package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage {

	@FindBy(xpath="//input[@class='gLFyf']")
	public WebElement searchTab;
	
	

}

package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public static WebDriver driver=null;
	//can be used in other class if decleared as pubclic and sttaic
	//applicable in same package classes
	@Before 
	public void setUp () {
		
		driver=new ChromeDriver();
	    WebDriverManager.chromedriver().setup();
	    driver.manage().window().maximize();	 
	}
	
	@After
	public void cleanUp() {
		driver.quit();
		
	}

}

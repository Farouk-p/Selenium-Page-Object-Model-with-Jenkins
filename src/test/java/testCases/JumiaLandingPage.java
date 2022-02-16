package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageElements.JumiaLandingPageObj;

public class JumiaLandingPage {
	
	WebDriver driver = null;
	@Test
	public void navigateToLoginPage () {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAROUK\\eclipse-workspace\\googleTask\\Driver\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--headless");
//	    
		driver= new ChromeDriver();
		JumiaLandingPageObj LandingPageObj = new JumiaLandingPageObj(driver);
		
		driver.get("https://jumia.com");
		LandingPageObj.clickOnAccountButton();
		LandingPageObj.clickOnSigninButton();
		
		driver.close();
		
		
	}

}

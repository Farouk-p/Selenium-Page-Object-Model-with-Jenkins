package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import pageElements.GoogleSearchPage;

public class GoogleSearch {
	
	static WebDriver driver = null;
	@Test
	public static void googleSearchTest () {
		System.out.println("Second CICD");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAROUK\\eclipse-workspace\\googleTask\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
	    
		driver= new ChromeDriver(options);
		
		GoogleSearchPage searchPageObj = new GoogleSearchPage(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.textInSearchBox("Popoola");
		searchPageObj.clickSearchButton();
		driver.close();
	}

}

package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase1 {


	@Test
	public void Scenario() {

		System.out.println("First CICD");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\FAROUK\\eclipse-workspace\\googleTask\\Driver\\chromedriver.exe");
		
		
		//		WebDriverManager.chromedriver().setup();
		//			
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
		WebDriver browser = new ChromeDriver(options);

		//Creating an instance of driver, to launch browser
		//		WebDriver browser = new ChromeDriver();

		//to open the google search page
		browser.get("https://www.google.com/");

		//to maximize the browser
		browser.manage().window().maximize();

		//to check the actual url is displayed
		System.out.println(browser.getTitle());

		//		//to write name into search field
		//		browser.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Popoola Farouk");
		//		
		//		//to click the search button
		//		browser.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		//		
		//to close the browser
		browser.close();
	} 


}



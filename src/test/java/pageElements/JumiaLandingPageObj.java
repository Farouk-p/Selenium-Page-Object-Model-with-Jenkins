package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JumiaLandingPageObj {
	//Initialize driver
	WebDriver driver = null;
	//select elements
	By Account_button = By.xpath("//*[@id=\"jm\"]/header/section/div/div[2]/div[1]/label");
	By Signin_button = By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a");
	
	public JumiaLandingPageObj (WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAccountButton () {
		driver.findElement(Account_button).click();
	}

	public void clickOnSigninButton () {
		driver.findElement(Signin_button).click();
	}

}

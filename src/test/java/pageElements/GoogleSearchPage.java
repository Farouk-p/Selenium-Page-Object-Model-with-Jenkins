package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver = null;
	
	By textbox_search = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	By button_search = By.name("btnK");
	
	public GoogleSearchPage (WebDriver driver) {
		this.driver = driver;	
	}

	public void textInSearchBox (String text) {	
		driver.findElement(textbox_search).sendKeys(text);	
	}
	
	public void clickSearchButton () {
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	}

}

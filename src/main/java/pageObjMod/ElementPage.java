package pageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPage {
	public WebDriver driver;

	public ElementPage(WebDriver driver) {
		this.driver = driver;
	}

	
	By fullName_tb = By.id("userName");
	By email_tb = By.id("userEmail");
	By currentAddress_tb = By.id("currentAddress");
	By permanentAddress_tb = By.id("permanentAddress");

	
	
	public WebElement get_fullName_tb() {
		return driver.findElement(fullName_tb);
	}

	public WebElement get_email_tb() {
		return driver.findElement(email_tb);
	}

	public WebElement get_currentAddress_tb() {
		return driver.findElement(currentAddress_tb);
	}

	public WebElement get_permanentAddress_tb() {
		return driver.findElement(permanentAddress_tb);
	}

}

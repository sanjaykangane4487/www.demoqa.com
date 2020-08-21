package pageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPage {
	public WebDriver driver;

	public FormsPage(WebDriver driver) {
		this.driver = driver;
	}

	By practiceForm_btn = By.xpath("//span[text()='Practice Form']");
	By firstName_tb = By.id("firstName");
	By lastName_tb = By.id("lastName");
	By email_tb = By.id("userEmail");
	By gender_rb = By.xpath("//input[@value='Male']");
	By mobileNumber_tb = By.id("userNumber");
	By dobInput_box = By.id("dateOfBirthInput");
	By datePicker = By.xpath("//div[@class='react-datepicker']");

	public WebElement get_practiceForm_btn() {
		return driver.findElement(practiceForm_btn);
	}

	public WebElement get_firstName_tb() {
		return driver.findElement(firstName_tb);
	}

	public WebElement get_lastName_tb() {
		return driver.findElement(lastName_tb);
	}

	public WebElement get_email_tb() {
		return driver.findElement(email_tb);
	}

	public WebElement get_gender_rb() {
		return driver.findElement(gender_rb);
	}

	public WebElement get_mobileNumber_tb() {
		return driver.findElement(mobileNumber_tb);
	}

	public WebElement get_dobInput_box() {
		return driver.findElement(dobInput_box);
	}

	public WebElement get_datePicker() {
		return driver.findElement(datePicker);
	}

}

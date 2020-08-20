package PageObjMod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By elements_btn = By.xpath("//div[@class='card mt-4 top-card'][1]");
	By forms_btn = By.xpath("//div[@class='card mt-4 top-card'][2]");
	By alerts_btn = By.xpath("//div[@class='card mt-4 top-card'][3]");
	By widgets_btn = By.xpath("//div[@class='card mt-4 top-card'][4]");
	By interactions_btn = By.xpath("//div[@class='card mt-4 top-card'][5]");
	By book_btn = By.xpath("//div[@class='card mt-4 top-card'][6]");
	By mainHeader_txt = By.xpath("//div[@class='main-header']");

	public WebElement get_elements_btn() {
		return driver.findElement(elements_btn);
	}

	public WebElement get_forms_btn() {
		return driver.findElement(forms_btn);
	}

	public WebElement get_alerts_btn() {
		return driver.findElement(alerts_btn);
	}

	public WebElement get_widgets_btn() {
		return driver.findElement(widgets_btn);
	}

	public WebElement get_interactions_btn() {
		return driver.findElement(interactions_btn);
	}

	public WebElement get_book_btn() {
		return driver.findElement(book_btn);
	}

	public WebElement get_mainHeader_txt() {
		return driver.findElement(mainHeader_txt);
	}
}
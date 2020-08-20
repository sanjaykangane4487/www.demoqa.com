package demoQaAuto;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjMod.HomePage;

public class HomePageTest extends BaseDriver {
	WebDriver driver;
	HomePage hp;
	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized");
		hp = new HomePage(driver);
	}

	@Test(priority = 0)
	public void launchUrl() {
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "ToolsQA");
		//hp = new HomePage(driver);
	}

	@Test(priority = 1)
	public void verify_Elements_Link() {
		js.executeScript("arguments[0].click();", hp.get_elements_btn());
		Assert.assertEquals(hp.get_mainHeader_txt().getText(), "Elements");
	}

	@Test(priority = 2)
	public void verify_Forms_Link() {
		driver.navigate().back();
		js.executeScript("arguments[0].click();", hp.get_forms_btn());
		Assert.assertEquals(hp.get_mainHeader_txt().getText(), "Forms");
	}

	@Test(priority = 2)
	public void verify_Alerts_Link() {
		driver.navigate().back();
		js.executeScript("arguments[0].click();", hp.get_alerts_btn());
		Assert.assertEquals(hp.get_mainHeader_txt().getText(), "Alerts, Frame & Windows");
	}

	@Test(priority = 2)
	public void verify_Widgets_Link() {
		driver.navigate().back();
		js.executeScript("arguments[0].click();", hp.get_widgets_btn());
		Assert.assertEquals(hp.get_mainHeader_txt().getText(), "Widgets");
	}

	@Test(priority = 2)
	public void verify_Interactions_Link() {
		driver.navigate().back();
		js.executeScript("arguments[0].click();", hp.get_interactions_btn());
		Assert.assertEquals(hp.get_mainHeader_txt().getText(), "Interactions");
	}

	@Test(priority = 2)
	public void verify_Book_Link() {
		driver.navigate().back();
		js.executeScript("arguments[0].click();", hp.get_book_btn());
		Assert.assertEquals(hp.get_mainHeader_txt().getText(), "Book Store");
	}

	@AfterClass
	public void cloasBrowser() {
		driver.quit();
	}
	
	/*
	 * @DataProvider public Object[][] getData() { // rows stands for how many
	 * different data types test should run // column stands for how many values per
	 * each test Object[][] data = new Object[2][2]; data[0][0] =
	 * "nonrestricted@user.com"; data[0][1] = "123123"; // data[0][2] =
	 * "NON Restricted user"; data[1][0] = "restricted@user.com"; data[1][1] =
	 * "899889"; // data[1][2] = "Restricted user"; return data; }
	 */

}

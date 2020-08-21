package demoQaAuto;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjMod.FormsPage;
import pageObjMod.HomePage;
import utilities.reusableMethods;

import org.testng.AssertJUnit;
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

public class FormsPageTest extends BaseDriver {
	WebDriver driver;
	HomePage hp;
	FormsPage fp;
	public static Logger log = LogManager.getLogger(ElementPageTest.class.getName());

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized");
		hp = new HomePage(driver);
		driver.get(prop.getProperty("url"));
	}

	@Test(priority = 0)
	public void verify_Forms_Page_Link() {
		js.executeScript("arguments[0].click();", hp.get_forms_btn());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.demoqa.com/forms");
		fp = new FormsPage(driver);
		fp.get_practiceForm_btn().click();
	}

	@Test(priority = 1)
	public void verify_TextBox() {
		wait.until(ExpectedConditions.visibilityOf(fp.get_firstName_tb()));
		Assert.assertEquals(fp.get_firstName_tb().getAttribute("placeholder"), "First Name");
		Assert.assertEquals(fp.get_lastName_tb().getAttribute("placeholder"), "Last Name");
		Assert.assertEquals(fp.get_email_tb().getAttribute("placeholder"), "name@example.com");
		Assert.assertEquals(fp.get_mobileNumber_tb().getAttribute("placeholder"), "Mobile Number");

		fp.get_firstName_tb().sendKeys("John");
		System.out.println("Entered firstname");
		fp.get_lastName_tb().sendKeys("Rambo");
		System.out.println("Entered Las tname");
		fp.get_email_tb().sendKeys("thisismy@email.com");
		//fp.get_gender_rb().click();
		js.executeScript("arguments[0].click();", fp.get_gender_rb());
		System.out.println("Entered email");
		fp.get_mobileNumber_tb().sendKeys("1231231230");
		System.out.println("Entered mobile number");
		fp.get_dobInput_box().click();
		System.out.println("clicked on DOB");
		reusableMethods.dateSelcetor(fp.get_datePicker(), "04/April/1987");
		System.out.println("Dob Selected");
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}

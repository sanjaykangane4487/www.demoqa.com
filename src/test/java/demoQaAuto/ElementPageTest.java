package demoQaAuto;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjMod.ElementPage;
import pageObjMod.HomePage;

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

public class ElementPageTest extends BaseDriver {
	WebDriver driver;
	HomePage hp;
	ElementPage ep;
	public static Logger log = LogManager.getLogger(ElementPageTest.class.getName());

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver initialized");
		hp = new HomePage(driver);
		driver.get(prop.getProperty("url"));
	}

	@Test(priority = 0)
	public void verify_Element_Page_Link() {
		js.executeScript("arguments[0].click();", hp.get_elements_btn());
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.demoqa.com/elements");
		hp.get_textBox_btn().click();
	}

	@Test(priority = 1)
	public void verify_TextBox() {
		ep = new ElementPage(driver);
		wait.until(ExpectedConditions.visibilityOf(ep.get_fullName_tb()));
		AssertJUnit.assertEquals(ep.get_fullName_tb().getAttribute("placeholder"), "Full Name");
		AssertJUnit.assertEquals(ep.get_email_tb().getAttribute("placeholder"), "name@example.com");
		AssertJUnit.assertEquals(ep.get_currentAddress_tb().getAttribute("placeholder"), "Current Address");

		ep.get_fullName_tb().sendKeys("John Rambo");
		ep.get_email_tb().sendKeys("thisismy@email.com");
		ep.get_currentAddress_tb().sendKeys("Ganesh Heritage, Pune 411012");
		ep.get_permanentAddress_tb().sendKeys("Anil cop op ho so ltd A10, Kalyan 421306");

		/*Assert.assertEquals(js.executeScript("arguments[0].Text;", ep.get_fullName_tb()), "John Rambo");
		Assert.assertEquals(ep.get_fullName_tb().getText(), "John Rambo");
		Assert.assertEquals(ep.get_email_tb().getText(), "thisismy@email.com");
		Assert.assertEquals(ep.get_currentAddress_tb().getText(), "Ganesh Heritage, Pune 411012");
		Assert.assertEquals(ep.get_permanentAddress_tb().getText(), "Anil cop op ho so ltd A10, Kalyan 421306");
*/
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}

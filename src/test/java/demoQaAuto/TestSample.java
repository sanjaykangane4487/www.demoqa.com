package demoQaAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.reusableMethods;

public class TestSample {
	public static void main(String[] args) throws InterruptedException {

		String dob = "20/March/1987";
		String[] arrDob = dob.split("/");
		System.out.println(arrDob[0]);
		System.out.println(arrDob[1]);
		System.out.println(arrDob[2]);
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		WebElement dobEle = driver.findElement(By.id("dateOfBirthInput"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", dobEle);

		WebElement cal = driver.findElement(By.xpath("//div[@class='react-datepicker']"));
		reusableMethods.dateSelcetor(cal, dob);

	}
}

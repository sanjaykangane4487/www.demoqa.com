package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class reusableMethods {

	public static void dateSelcetor(WebElement cal, String dob) {
		String[] arrDob = dob.split("/");
		Select year = new Select(cal.findElement(By.className("react-datepicker__year-select")));
		year.selectByValue(arrDob[2]);

		Select month = new Select(cal.findElement(By.className("react-datepicker__month-select")));
		month.selectByVisibleText(arrDob[1]);

		cal.findElement(
				By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--0" + arrDob[0] + "')]"))
				.click();

	}
}

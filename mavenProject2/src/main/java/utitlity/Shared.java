package utitlity;

import org.openqa.selenium.WebElement;

public class Shared {

	public static boolean verifyLogo(WebElement ele) {
		return ele.isDisplayed();
	}
	public static void clickOnMen(WebElement ele) {
		ele.click();
	}
}

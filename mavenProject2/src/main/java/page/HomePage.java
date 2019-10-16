package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import utitlity.Shared;

public class HomePage {
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div/div[1]/a/img")
	
	WebDriver driver;
	

	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void logoVerify() {
		Shared.verifyLogo(driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[1]/a/img")));
	}

}

package pompolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;

public class MyAccountPage {
	@FindBy(xpath = "//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement userName;
	
	@FindBy(className = "h_l")private WebElement logOutButton;


	public MyAccountPage(WebDriver driver) 
	{ PageFactory.initElements(driver, this); }

	public String getActualUserName() throws InterruptedException {
		Reporter.log("getting actual userName", true);
		Utility.wait(2000);
		String actualUN = userName.getText();
		return actualUN;
	}

	public void clickOnLogOutButton() {
		Reporter.log("logging out...", true);
		logOutButton.click();
	}
	
}

package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

	WebDriver driver;

	public GoogleHomePage(WebDriver dr) {

		driver = dr;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "APjFqb")
	WebElement searchBar;

	// ""btnk" is a locator
	@FindBy(name = "btnK")
	WebElement searchButton;

	@FindBy(id = "result-stats")
	WebElement searchResult;

	public void enterProduct(String s) {
		searchBar.sendKeys(s);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public boolean verifySearchResultIsDisplayed() {

		return searchResult.isDisplayed();

	}
}

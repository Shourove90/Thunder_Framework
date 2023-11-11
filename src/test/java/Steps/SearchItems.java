package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Common.GoogleBase;
import Page.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchItems extends GoogleBase {

	GoogleHomePage gp;

//@given means requirment
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {

		launchBrowser();
	}

//@When means action
	@When("i enter the {string} in the search bad")
	public void i_enter_the_in_the_search_bad(String string) {

		gp = new GoogleHomePage(driver);
		gp.enterProduct(string);

		// use inspect to get the code from google search bar

	}

	@When("i click on the serch button")
	public void i_click_on_the_serch_button() {
		// This is where the search button was click,
	gp= new GoogleHomePage(driver);
	gp.clickOnSearchButton();
	}

	// @Then is Validation
	@Then("i can see the search result sucessfully")
	public void i_can_see_the_search_result_sucessfully() {
		gp= new GoogleHomePage(driver);
		
		
		Assert.assertTrue(gp.verifySearchResultIsDisplayed());

		// this is for closing browser
		closeAll();
	}

}

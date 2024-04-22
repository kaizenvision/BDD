package stepDefination;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;
import com.pomclass.GooglePagePom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class GoogleSearch extends BaseClass {
	
	@Given("I am on google search page")
	public void i_am_on_google_search_page() throws FileNotFoundException, IOException {
	    launchWebsite();
	}

	@When("I enter {string} in search field and hit enter")
	public void i_enter_selenium_in_search_field_and_hit_enter(String searchTexString) {
	   GooglePagePom googlePagePom = new GooglePagePom();
	   googlePagePom.setSerchText(searchTexString);
	}

	@Then("I page title starts with {string}")
	public void i_page_title_starts_with_selenium(String checkTitle) {
	    GooglePagePom googlePagePom = new GooglePagePom();
		String actualPageTitle = googlePagePom.getPageTitle();
		assertEquals(checkTitle, actualPageTitle);
	}

	
	

}

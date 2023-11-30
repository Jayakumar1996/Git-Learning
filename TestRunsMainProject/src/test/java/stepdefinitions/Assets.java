package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class Assets extends BaseClass {

	@Given("user enters email {string} and enters password {string} and clicks on login button")
	public void user_enters_email_and_enters_password_and_clicks_on_login_button(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}

	@Then("Click the Asset module which is located in the sidebar.")
	public void click_the_asset_module_which_is_located_in_the_sidebar() {

		driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();
		driver.findElement(By.xpath("//span[text()='Assets']")).click();
	}

//	@Then("Ensure that the asset page is displayed.")
//	public void ensure_that_the_asset_page_is_displayed() {
//
//	}
//
//	@Then("Verify whether the asset page is as per The Figma UI.")
//	public void verify_whether_the_asset_page_is_as_per_the_figma_ui() {
//
//	}

	@Then("Click the Add button and a pop-up displays.")
	public void click_the_add_button_and_a_pop_up_displays() {

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Cancel'])[3]")).click();
		driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();
	}

	@Then("Enter Asset Name and click Search.")
	public void enter_asset_name_and_click_search() {

		System.out.println("Search function is not implemented");
	}

	@Then("Verify that the User able to see the Assets Details after search.")
	public void verify_that_the_user_able_to_see_the_assets_details_after_search() {
		
		System.out.println("Asset details can't be shown since, Search function is not implemented");

	}

	@Then("Search for assets using any name.")
	public void search_for_assets_using_any_name() {

		driver.findElement(By.id("Search")).sendKeys("Asset");
	}

	@Then("Verify that the page displays no results found.")
	public void verify_that_the_page_displays_no_results_found() {

	}

	@Then("Directly click the search button by leaving the fields empty.")
	public void directly_click_the_search_button_by_leaving_the_fields_empty() {

	}

	@Then("Verify that the page displays remain unchanged.")
	public void verify_that_the_page_displays_remain_unchanged() {

	}

	@Then("Search with non existing assets.")
	public void search_with_non_existing_assets() {

	}


	@Then("Click the filter and select the asset based on the availability.")
	public void click_the_filter_and_select_the_asset_based_on_the_availability() {

	}

	@Then("Verify that the filtered asset is displayed properly based on the availability of asset.")
	public void verify_that_the_filtered_asset_is_displayed_properly_based_on_the_availability_of_asset() {

	}

	@Then("Click the required asset which is present in the table.")
	public void click_the_required_asset_which_is_present_in_the_table() {

		driver.findElement(By.xpath("//div[text()='MD5 Algorithm6']")).click();
	}

	@Then("Ensure that the asset details page is opening when the user clicks the specific asset in the table.")
	public void ensure_that_the_asset_details_page_is_opening_when_the_user_clicks_the_specific_asset_in_the_table() {

	}

	@Then("Click the pagination dropdown and view the next page.")
	public void click_the_pagination_dropdown_and_view_the_next_page() {

	}

	@Then("Click the previous link in the pagination.")
	public void click_the_previous_link_in_the_pagination() {

	}

	@Then("Click the Next link in the pagination.")
	public void click_the_next_link_in_the_pagination() {

	}

	@Then("Ensure that the previous button is disabled.")
	public void ensure_that_the_previous_button_is_disabled() {

	}

	@Then("Click the last link in the pagination.")
	public void click_the_last_link_in_the_pagination() {

	}

	@Then("Ensure that the last button is disabled.")
	public void ensure_that_the_last_button_is_disabled() {

	}

}

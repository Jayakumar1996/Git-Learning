package stepdefinitions;

import org.openqa.selenium.By;

import baseclass.BaseClass;
import io.cucumber.java.en.*;

public class Login extends BaseClass {

	@Given("A web browser is at the Testrunz login page")
	public void a_web_browser_is_at_the_testrunz_login_page() {
		System.out.println("Welcome");
	}

	@Then("Leave the fields empty and directly click the Log In button")
	public void leave_the_fields_empty_and_directly_click_the_log_in_button() {

		driver.findElement(By.xpath("//button[text()='Log in']"));
	}

	@Then("Enter the email id {string}")
	public void enter_the_email_id(String string) {

		driver.findElement(By.id("email")).sendKeys(string);
		
	}

	@Then("Enter the password {string}")
	public void enter_the_password(String string) {

		driver.findElement(By.id("password")).sendKeys(string);
		
	}

	@Then("Click Log In button")
	public void click_log_in_button() {

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("Enter the registered email id {string}")
	public void enter_the_registered_email_id(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
		

	}

	@Then("Enter the registered password {string}")
	public void enter_the_registered_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
		

	}

	@Then("Click the Remember me checkbox")
	public void click_the_remember_me_checkbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@Then("User clicks the forgot your password? link text")
	public void user_clicks_the_forgot_your_password_link_text() {
		driver.findElement(By.xpath("//p[text()='Forget your password?']")).click();

	}

	@Then("User clicks the click here to signup link text")
	public void user_clicks_the_click_here_to_signup_link_text() {
		driver.findElement(By.xpath("//span[text()='Click here to Sign up!']")).click();

	}

	@Then("Click the eye icon and the field shows the password characters.")
	public void click_the_eye_icon_and_the_field_shows_the_password_characters() {
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

	@Then("Again, click the eye icon and the field hides the password characters and vice versa.")
	public void again_click_the_eye_icon_and_the_field_hides_the_password_characters_and_vice_versa() {
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}

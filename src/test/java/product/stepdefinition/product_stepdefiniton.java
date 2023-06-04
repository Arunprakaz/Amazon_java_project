package product.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import amazon.pom.Signin;
import amazon.product.Base_class;
import amazon.property.file_reader_manager;
import cucumber.api.java.en.*;
import product.runner.product_runner;

public class product_stepdefiniton extends Base_class {

	public static WebDriver driver = product_runner.driver;

	Signin si = new Signin(driver);
	
	@Given("^navigate to amazon website$")
	public void navigate_to_amazon_website() throws Throwable {
		
		geturl(file_reader_manager.getinstance().getinstanceCR().geturl());
		// driver.get("https://www.amazon.in/");
	}

	@When("^user need to select the profile and click sign in bar$")
	public void user_need_to_select_the_profile_and_click_sign_in_bar() throws Throwable {
		// clickbutton(driver.findElement(By.xpath("//*[text()='Account & Lists']")));
		mouse(driver.findElement(By.xpath("//*[text()='Account & Lists']")));
		Thread.sleep(3000);
		mouse(driver.findElement(By.xpath("//*[text()='Sign in']")));
		clickbutton(driver.findElement(By.xpath("//*[text()='Sign in']")));
	}

	@Then("^enter email id \"([^\"]*)\"$")
	public void enter_email_id(String arg1) throws Throwable {
		senddata(driver.findElement(By.xpath("//*[@id='ap_email']")), arg1);
		clickbutton(driver.findElement(By.xpath("//*[@id='continue']")));

	}

	@Then("^enter the password \"([^\"]*)\"$")
	public void enter_the_password(String arg1) throws Throwable {
		Thread.sleep(2000);
		senddata(driver.findElement(By.xpath("//*[@id='ap_password']")), arg1);
		Thread.sleep(2000);
		clickbutton(driver.findElement(By.xpath("//*[@id='signInSubmit']")));

	}

	@Then("^click enter$")
	public void click_enter() throws Throwable {

	}

	@When("^user need to select the search bar$")
	public void user_need_to_select_the_search_bar() throws Throwable {

	}

	@Then("^enter the product name and click search$")
	public void enter_the_product_name_and_click_search() throws Throwable {

	}

	@Then("^view the product$")
	public void view_the_product() throws Throwable {

	}

}

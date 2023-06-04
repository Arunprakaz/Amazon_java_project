package amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	

	public static WebDriver driver;
	
	@FindBy (xpath = "\"//*[@id='ap_email']\"")
	private WebElement username;
	
	@FindBy (xpath = "")
	private WebElement password;

	@FindBy (xpath = "")
	private WebElement loginbtn;
	
	public Signin(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	

	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
}

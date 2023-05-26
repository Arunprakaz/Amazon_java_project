package amazon.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Base_class {
	
	public static WebDriver driver;

	public static WebDriver getbrowser(String browser)
	{
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
				 driver= new ChromeDriver();
				
				
			}
			else {
				System.out.println("invalid browser ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().window().maximize();
		return driver ;
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void senddata(WebElement element , String data) {
		element.sendKeys(data);
		
	}
	public static void clickbutton(WebElement element) {
		element.click();
		
	}
public static void windowhandle() {
	
	
	
}
public static void mouse(WebElement element) {
	Actions ac = new Actions(driver);
	ac.contextClick(element).build().perform();
	
}
}



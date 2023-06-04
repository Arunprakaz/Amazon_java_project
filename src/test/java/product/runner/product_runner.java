package product.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import amazon.product.Base_class;
import amazon.property.file_reader_manager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\product\\feature\\product.feature" ,
glue = "product\\stepdefinition" ,monochrome = true
)

public class product_runner {
	
	public static WebDriver driver;

		@BeforeClass
		public static void setUp() throws Throwable {
			
			driver = Base_class.getbrowser(file_reader_manager.getinstance().getinstanceCR().getbrowser());
			
		}
		@AfterClass
		public static void tearDown() {
			driver.quit();
		}
		
}
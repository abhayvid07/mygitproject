package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhay\\Selenium\\webdriver\\gecko\\driver\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	
  @Test
  public void openMyBlog() {
	  
	driver.get("https://www.softwaretestingmaterial.com/");
  }
  
  

}

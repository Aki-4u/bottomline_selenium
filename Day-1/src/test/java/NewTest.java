import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  String baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\selenium-java-4.5.0\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.get(baseURL);
      String testTitle = "OpenSource website";
      String originalTitle = driver.getTitle();
      AssertJUnit.assertEquals(originalTitle, testTitle);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Starting");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Done");
  }

}

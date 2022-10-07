import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
 
 
public class TestNGprority {
	static WebDriver driver;
	
	
 @Test(priority =0)
public void testCase1() {
	 String baseURL = "https://www.saucedemo.com/";
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\selenium-java-4.5.0\\chromedriver.exe");
	  driver = new ChromeDriver();
     driver.get(baseURL);
     
     WebElement username = driver.findElement(By.id("user-name"));
     username.sendKeys("standard_user");
     WebElement pwd = driver.findElement(By.id("password"));
     pwd.sendKeys("secret_sauce");
     
     WebElement  ele = driver.findElement(By.id("login-button"));
     ele.click();
     
     
 }
 
// @Test (priority = 1)
//	public void login() {
//	System.out.println("Test case 2");
//		
//	}

 @BeforeMethod
 public void beforeMethod() {
   System.out.println("This will execute before every Method");
 }
 
 @AfterMethod
 public void afterMethod() {
   System.out.println("This will execute after every Method");
 }
 
 @BeforeClass
 public void beforeClass() {
   System.out.println("This will execute before the Class");
 }
 
 @AfterClass
 public void afterClass() {
   System.out.println("This will execute after the Class");
 }
 
 @BeforeTest
 public void beforeTest() {
   System.out.println("This will execute before the Test");
 }
 
 @AfterTest
 public void afterTest() {
   System.out.println("This will execute after the Test");
 }
 
 @BeforeSuite
 public void beforeSuite() {
   System.out.println("This will execute before the Test Suite");
 }
 
 @AfterSuite
 public void afterSuite() {
   System.out.println("This will execute after the Test Suite");
 }
}

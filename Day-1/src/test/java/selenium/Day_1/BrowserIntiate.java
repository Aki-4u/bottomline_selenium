package selenium.Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserIntiate {

static WebDriver driver;
public static WebDriver browsersetup() throws IOException
{
	File f = new File("C:\\Users\\Admin\\Downloads\\DAY-1 AUTOMATION\\Day-1\\config.properties");
	
	FileInputStream fis = new FileInputStream(f);
	Properties p = new Properties();
	p.load(fis);
String browsername = p.getProperty("browsername");
	
switch (browsername)
{

case "chrome":
{

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\selenium-java-4.5.0\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.mycontactform.com/samples.php");
break;
}
case "firefox":

{
System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.mycontactform.com/samples.php");
break;
}

}
return driver;

}
}

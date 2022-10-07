package selenium.Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Windows {
        static WebDriver driver;
        public static void main(String[] args) throws InterruptedException, IOException {
File f=new File("C:\\Users\\Admin\\Downloads\\DAY-1 AUTOMATION\\Day-1\\config.properties");
                
                FileInputStream fis=new FileInputStream(f);
                Properties p=new Properties();
                p.load(fis);
                                
        
                        
                        driver=BrowserIntiate.browsersetup();
driver.get(p.getProperty("url1"));
driver.findElement(By.className("blinkingText")).click();

Thread.sleep(2000);
String win=driver.getWindowHandle();
System.out.println(win);
System.out.println(driver.getTitle());
Set<String> windows=driver.getWindowHandles();
System.out.println(windows);

Iterator<String>itr=windows.iterator();
String win1=itr.next();
System.out.println(win1);
String win2=itr.next();
System.out.println(win2);
driver.switchTo().window(win2);
Thread.sleep(2000);
driver.findElement(By.xpath(p.getProperty("register"))).click();
        }

}


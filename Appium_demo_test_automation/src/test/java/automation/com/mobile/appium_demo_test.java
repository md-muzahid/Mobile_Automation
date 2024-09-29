package automation.com.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class appium_demo_test {
	 public AndroidDriver<AndroidElement> driver;
	 @BeforeSuite
	 public void start() throws Exception {
		 File f = new File("src");
	     File fs = new File(f, "Android_Appium_Demo (1).apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "android");
	        capabilities.setCapability("udid", "emulator-5554");
	        capabilities.setCapability("deviceName", "Automation");
	        capabilities.setCapability("app", fs.getAbsolutePath());

	        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	 @AfterSuite
	 public void driverstop() {
		 driver.quit();
	 }
	 @Test
	 public void mainfunction() {
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Btn6\"]")).click();
		 driver.findElement(By.id("com.skill2lead.appiumdemo:id/Et4")).sendKeys("admin@gmail.com");
		 driver.findElement(By.id("com.skill2lead.appiumdemo:id/Et5")).sendKeys("admin123");
		 driver.findElement(By.id("com.skill2lead.appiumdemo:id/Btn3")).click();
		 System.out.println("Login successful");
		 
		 String s="Samanta";
		 driver.findElement(By.id("com.skill2lead.appiumdemo:id/Edt_admin")).sendKeys(s);
		 driver.findElement(By.id("com.skill2lead.appiumdemo:id/Btn_admin_sub")).click();
		 String result=driver.findElement(By.id("com.skill2lead.appiumdemo:id/Tv_admin")).getText();
		 if (result.equals(s)) {
             System.out.println("Text matches the expected value: " + result);
         } else {
             System.out.println("Text does not match. Actual value: " + s);
         }
	 }
}

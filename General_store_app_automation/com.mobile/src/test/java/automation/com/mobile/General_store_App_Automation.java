package automation.com.mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class General_store_App_Automation {
	 public AndroidDriver<AndroidElement> driver;
	    @BeforeSuite
	    public void driverSetup() throws MalformedURLException {
	        File f = new File("src");
	        File fs = new File(f, "General-Store.apk");
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("udid", "emulator-5554");
	        cap.setCapability("deviceName", "Automation");
//	        cap.setCapability("appPackage", "com.androidsample.generalstore");
//	        cap.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
	        cap.setCapability("app", fs.getAbsolutePath());

	        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    @AfterSuite
	    public void quitDriver(){
	       //  driver.removeApp("com.androidsample.generalstore");
	        driver.quit();
	    }


	    @Test
	    public void testGeneralStore() throws Exception {
	    	 driver.findElement(By.id("android:id/text1")).click();
	         driver.findElement(By.xpath("//android.widget.TextView[@text='Angola']")).click();
	         WebElement name =  driver.findElement(By.id("com.androidsample.generalstore:id/nameField"));
	         name.sendKeys("Samanta");
	         Thread.sleep(2000);
	         driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	         Thread.sleep(5000);
	         System.out.println("Happy shopping");
	    }
}

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

public class selendroidTestApp {
	  public AndroidDriver<AndroidElement> driver;
	    @BeforeSuite
	    public void driverSetup() throws MalformedURLException {
	        File f = new File("src");
	        File fs = new File(f, "selendroid-test-app.apk");
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("udid", "emulator-5554");
	        cap.setCapability("deviceName", "Automation");
//	        cap.setCapability("appPackage", "io.selendroid.testapp");
//	        cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
	        cap.setCapability("app", fs.getAbsolutePath());

	        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    @AfterSuite
	    public void quitDriver(){
	       // driver.removeApp("io.selendroid.testapp");
	        driver.quit();
	    }


	    @Test
	    public void testGeneralStore() throws Exception {
	    	WebDriverWait wait = new WebDriverWait(driver, 20);
	        wait.until(ExpectedConditions.elementToBeClickable(By.id("io.selendroid.testapp:id/waitingButtonTest"))).click();

	        AndroidElement progressBar = (AndroidElement) driver.findElement(By.id("android:id/progress"));

	        // Wait for the progress bar to become visible
	        wait.until(ExpectedConditions.visibilityOf(progressBar));

	        // Wait for the progress bar to disappear
	        wait.until(ExpectedConditions.invisibilityOf(progressBar));
	      driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("test1");
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("email@gmail.com");
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("password");
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/inputName")).clear();
	      driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys("tester");
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage")).click();
	      Thread.sleep(200);
	      
	      driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Python\"]")).click();
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
	      Thread.sleep(200);
	      driver.findElement(By.id("io.selendroid.testapp:id/buttonRegisterUser")).click();
	      Thread.sleep(200);
	    }

}

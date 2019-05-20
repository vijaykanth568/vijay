package sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
public class ABCmouse {
	
	WebDriver driver;
	@BeforeClass
	public void openABC() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		//capabilities.setCapability("VERSION", ""); 
	    capabilities.setCapability("deviceName","Nexus_7_2012_API_28");
		capabilities.setCapability("platformName","Android");
		//capabilities.setCapability(MobileCapabilityType.APP, "mobi.abcmouse.academy_goo_2019-01-31.apk");
		//<Capabilities><uap:Capability Name="objects3D"/></Capabilities>

	   
	   capabilities.setCapability("appPackage", "mobi.abcmouse.academy_goo");
	   
	   capabilities.setCapability("appActivity","com.abcmouse.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
	 //Create RemoteWebDriver instance and connect to the Appium server
	  //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    Thread.sleep(2000);
	    
	}
	
	@Test(priority = 0) 
	public void testCal() throws Exception {
		allowAppPermission();
		System.out.println("Clicked on Allow Button ");
		Thread.sleep(20000);
		
	}
	
	
	private void allowAppPermission() {
		while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0) 

		 {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
		 }
		
	}
	
	@Test(priority = 1)
	public void loginABC () throws InterruptedException, FindFailed{
		driver.findElement(MobileBy.xpath("//*[@text='Log In']")).click();
		Thread.sleep(5000);
		 
//		TouchAction action = new TouchAction(driver);
//		action.move(254,410);
//		action.click();
//		int start_x=75, start_y=500,end_x=75,end_y=0,duration=800;		
//      driver.swipe(start_x=75, start_y=500, end_x=75, end_y=0, duration=800);
		
        
		
		
		 Screen s = new Screen();
		 
//		 TouchAction touchAction= new TouchAction((MobileDriver) driver);
//		touchAction.tap(292, 423).perform();
		 Pattern image1 = new Pattern("C:\\Users\\admin\\Desktop\\Email.PNG");
		 //Pattern image2 = new Pattern("C:\\Users\\Admin\\Desktop\\Sikuli\\enterEmail.PNG");
		//s.find("C:\\Users\\Admin\\Desktop\\Skull\\Email.PNG"); 
		 s.wait(image1, 10);
		 s.click(image1);
//		 s.wait(image2, 10);
//		 s.type(image2, "vijay");
		Thread.sleep(3000);
	  
		// s.type("C:\\Users\\Admin\\Desktop\\Email.png","vijay");
   	     System.out.println("pause button clicked");
		 
		
		
	}
	
	
//	public void tap(int index){
//		List<WebElement> li = driver.findElements(By.className("android.view.View"));
//		li.get(0).click();
//		}

	@AfterClass
	public void quit(){
		//driver.quit();
	}

}
package sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
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

//	   
//	   capabilities.setCapability("appPackage", "mobi.abcmouse.academy_goo");
//	   
//	   capabilities.setCapability("appActivity","com.abcmouse.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
//	 //Create RemoteWebDriver instance and connect to the Appium server
//	  //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
//	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//	    Thread.sleep(2000);
	    
	}
	
	

}
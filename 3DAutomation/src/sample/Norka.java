package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Norka {
	WebDriver driver;
	
	@Test
	public void start(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://103.248.209.132:8080");
		
	}

}

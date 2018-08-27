package edureka.selenium.jenkin.selenium_jenkin_proj;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SeleniumDemo {
	WebDriver driver = null;

	@Test
	public void LoginTest() throws InterruptedException {
		driver.get("http://192.168.56.101:3001/");
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.findElement(By.name("login")).sendKeys("Edureka");
		driver.findElement(By.name("password")).sendKeys("DevOps");
		Thread.sleep(1000);

		driver.findElement(By.name("click")).click();
		Thread.sleep(10000);
		Assert.assertEquals(true, true);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out
		.println("Hi, Welcome to Edureka's YouTube Live session on Selenium    	WebDriver");

	//	for windows
	//	System.setProperty("webdriver.chrome.driver",				"D:\\APPs\\chromebrowser\\chromedriver.exe");
		
		// for linux
		System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");

		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}

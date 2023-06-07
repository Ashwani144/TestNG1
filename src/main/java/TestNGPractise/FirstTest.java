package TestNGPractise;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void TestGoogle() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("amazon", Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		System.out.println("Test Execution is passed with google" +Thread.currentThread().getId());
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void TestFacebook() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com", Keys.ENTER);
		
		System.out.println(driver.getTitle());
		
		System.out.println("Test Execution is passed with facebbok " +Thread.currentThread().getId());
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
	
}

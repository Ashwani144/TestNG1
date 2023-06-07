package TestNGPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	
	WebDriver driver;
	FirefoxDriver firefoxoptions=new FirefoxDriver();
	ChromeOptions chromeoptions=new ChromeOptions();
	EdgeOptions edgeoptions = new EdgeOptions();
	
	@BeforeTest
	
	@Parameters("browser")
	public void Init(String browser){
		
		if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("Firefox is launch");
			
		}
		
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
			System.out.println("Chrome is launch");
			
		}
		
		if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.firefoxdriver().setup();
			driver=new EdgeDriver();
			System.out.println("edge is launch");
			
		}
		
	}
	
  @Test
  public void SourceforqualityPage(){
	  driver.get("http://sourceforqualitydev.iworklab.com/");
	  String actaul= driver.getTitle();
	  String expect= "Sourceforquality";
	  Assert.assertEquals(actaul.contains("Sourceforquality"), expect.contains("Sourceforquality"));
  }
  
 @AfterTest
 public void Post(){
	 driver.quit();
 }
}

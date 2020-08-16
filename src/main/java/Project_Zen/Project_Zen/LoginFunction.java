package Project_Zen.Project_Zen;

import java.io.IOException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;


public class LoginFunction {
	
	public static WebDriver driver;
	
	@Test
	public static void Configuration(){
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./BrowserExe/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.chrome.driver", "./BrowserExe/chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Not a Valid Browser Name ");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	} // Close Configuartion

	@Test
	public static void ClosingConfigurations(){
		driver.close();
	}  // Close ClosingConfigurations
	


		@Test
		public static void main(String args[]) throws InvalidFormatException, Exception{
		Configuration();
		//https://www.phptravels.net/login 
		//user@phptravels.com
		//demouser
		
	//	driver.get("https://www.phptravels.net/login");
		
		driver.get("http://www.demo.guru99.com/v4/");
		
		driver.findElement(By.name("uid")).sendKeys("mngr275327");
		driver.findElement(By.name("password")).sendKeys("bUqAman");
		driver.findElement(By.name("btnLogin")).click();	
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		
		// Verify Login is working successfully
		
	//	driver.findElement(By.xpath("//div[@class='row']//div[1]//label[1]//input[1]")).sendKeys("user@phptravels.com");
	//	driver.findElement(By.xpath("//div[@class='col-md-6 bg-white-shadow pt-25 ph-30 pb-40']//div[2]//label[1]//input[1]")).sendKeys("demouser");
	//	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']")).click();		
	//	driver.findElement(By.xpath("//div[@class='dropdown dropdown-login dropdown-tab show']")).click();
	//	driver.findElement(By.xpath("//@class='dropdown-menu dropdown-menu-right show']")).click();
	//	driver.findElement(By.xpath("//a[contains(@href, 'logout')]")).click();
		
		
		
	//	ClosingConfigurations();
		
		}	 // Main Closing

	
	
}

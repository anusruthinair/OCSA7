package ocsa7.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import ocsa7.elementRepository.LoginLocators;

public class BaseClass {
	public WebDriver driver;
	public DataUtility du=new DataUtility();
	public static WebDriver  listenerdriver;
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		listenerdriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod(alwaysRun=true)
   public void loginApp() throws IOException
   {
	   	driver.get(du.getDatafromProperties("url"));
	   	LoginLocators ll=new LoginLocators(driver);
	   	ll.loginApplication(du.getDatafromProperties("Username"),du.getDatafromProperties("Password"));
	   
   }
	@AfterMethod(alwaysRun=true)
   public void logoutApp()
   {
	  // driver.findElement(By.id("logoutLink")).click();
		LoginLocators ll=new LoginLocators(driver);
		ll.logoutApplication();
		
   }
	@AfterClass(alwaysRun=true)
   public void closeBrowser()
   {
	   driver.close();
   }
}








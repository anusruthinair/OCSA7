package ocsa7.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ocsa7.genericlibrary.BaseClass;
import ocsa7.genericlibrary.DataUtility;
@Listeners(ocsa7.genericlibrary.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	  @Test
	  public void customerCreation() throws EncryptedDocumentException, IOException
	  {
		
		Random r=new Random();
		int num=r.nextInt(10000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsi")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField"))
		                        .sendKeys(num+du.getDatafromExcel("Sheet1",0,0));
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		System.out.println("customer created");
	  }

}

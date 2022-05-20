package ocsa7.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ocsa7.genericlibrary.BaseClass;

public class ActitimeVersion  extends BaseClass{
	@Test
public void fetchVersion() throws InterruptedException
{
	driver.findElement(By.className("popup_menu_button_support")).click();
	driver.findElement(By.linkText("About your actiTIME")).click();
	String version=driver.findElement(By.cssSelector("span.productVersion")).getText();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aboutPopupCloseButtonId")));
	driver.findElement(By.id("aboutPopupCloseButtonId")).click();
	System.out.println(version);
}
}

package ocsa7.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ocsa7.genericlibrary.BaseClass;

public class Report extends BaseClass {
    @Test
	public void reportTitle()
	{
		driver.findElement(By.className("reports")).click();
		System.out.println(driver.getTitle());
	}
}

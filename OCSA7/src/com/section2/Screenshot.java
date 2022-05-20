package com.section2;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement session=driver.findElement(By.cssSelector("[alt='Fashion']"));
		File src=session.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/flipkartfashion.png");
		FileUtils.copyFile(src, trg);
}
}





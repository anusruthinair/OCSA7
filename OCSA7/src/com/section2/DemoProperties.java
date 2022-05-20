
package com.section2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\GANGA\\Documents\\sel\\commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String username=pobj.getProperty("Username");
		String password=pobj.getProperty("Password");
		String url=pobj.getProperty("url");
		System.out.println("username is "+username);
		System.out.println("password is "+password);
		System.out.println("url is "+url);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

}






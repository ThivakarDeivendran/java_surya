package org.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshots {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	driver.manage().window().maximize();
	
	TakesScreenshot t = (TakesScreenshot) driver;
	File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\mani\\eclipse-workspace\\Seliniumm\\screenshots\\ss.png");
	
//	FileUtils.copyFile(screenshotAs, dest);
	
	
	}
}

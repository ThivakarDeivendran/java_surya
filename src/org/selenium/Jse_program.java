package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse_program {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		WebElement twiter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		js.executeScript("arguments[0].scrollIntoView();", twiter);
		
		js.executeScript("window.scrollBy(0, 3000);");
		js.executeScript("window.scrollBy(0, -1300);");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
	}

}



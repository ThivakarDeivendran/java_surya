package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotcls {
	

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
		driver.manage().window().maximize();
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		Actions a= new Actions(driver);
		a.contextClick(fashion).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		WebElement NewReleases = driver.findElement(By.xpath("//a[text()='New Releases']"));
		a.contextClick(NewReleases).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}

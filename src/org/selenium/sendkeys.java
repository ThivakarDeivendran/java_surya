package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {
	private static boolean displayed;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("suryaangappan1998@gmail.com");
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		WebElement name = driver.findElement(By.name("pass"));
		name.sendKeys("surya@10");
		boolean enabled = name.isEnabled();
		System.out.println(enabled);
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.name("login"));
		boolean selected = login.isSelected();
		System.out.println(selected);
		login.click();
		driver.findElement(By.id("email"));
		System.out.println();
		
		
		    
		
		}

	}



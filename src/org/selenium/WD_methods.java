package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_methods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		//browser lunch
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//get()
		driver.get("https://www.facebook.com/");
		//get title
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//getCurrenturl()
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//navigate
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
		
		
		
		}

	}


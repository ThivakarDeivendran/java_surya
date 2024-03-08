package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Browser_lunch {
	public static void main(String[] args) {
		
	
//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\floderName\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.navigate().to("https://www.facebook.com/");
	}


}


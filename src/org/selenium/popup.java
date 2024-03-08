package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		System.out.println("--- simple alert ---");
		WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simplealert.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
        
		System.out.println("--- confiem alert ---");
		WebElement confirmalert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmalert.click();
		WebElement confirmalert1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirmalert1.click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.dismiss();
		
		System.out.println("--- confiem alert ---");
		WebElement promptalert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptalert.click();
		WebElement promptalert1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promptalert1.click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("suryadevi");
		alert3.accept();
		
	}

	
}




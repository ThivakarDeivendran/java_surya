package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("frames");
		driver.switchTo().defaultContent();
		WebElement multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiframe.click();
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));	
		driver.switchTo().frame(outerframe);
	    WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(innerframe);
	    WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
	    textbox1.sendKeys("selinium");
	    driver.switchTo().defaultContent();
	    WebElement singleframe1 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	    singleframe1.click();
	    
	    driver.switchTo().frame("singleframe");
	    textbox.clear();
	    textbox.sendKeys("hello");
	    
	    
	    
		}
	

}

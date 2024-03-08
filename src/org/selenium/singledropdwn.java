package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdwn {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createaccout = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createaccout.click();
		Thread.sleep(3000);
		
		
	
		WebElement date = driver.findElement(By.id("day"));
		Select s=new Select(date);
		s.selectByValue("10");
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1998");		
}
}

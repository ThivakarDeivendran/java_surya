package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.xpath("//a[text()='Drop-Down']"));
		dropdown.click();
		
		WebElement multiple = driver.findElement(By.id("superheros"));
		Select s=new Select(multiple);
		s.selectByIndex(5);
		s.selectByValue("am");
		s.selectByVisibleText("Aquaman");
		
		System.out.println("--is multiple--");
		boolean ismultiple = s.isMultiple();
		System.out.println(ismultiple);
		
		System.out.println("--get option--");
		List<WebElement> s1 = s.getOptions();
		for (WebElement options : s1) {
			System.out.println(options.getText());
			}
		System.out.println("--getallselectedoption");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			System.out.println(allSelectedOptions.get(i).getText());
		}
		Thread.sleep(3000);
		System.out.println("--getfirstselected");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		WebElement firstSelectedOption2 = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption2.getText());
		s.deselectAll();
		}
	
		}
		
	



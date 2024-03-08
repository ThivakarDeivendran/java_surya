package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtbl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		System.out.println("--- All data--");
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement alldata1 : alldata) {
		System.out.println(alldata1.getText());
		}
			
			System.out.println("--- row data--");
			List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
			for (WebElement rowdata1 : rowdata) {
				System.out.println(rowdata1.getText());
				
			}
			
			System.out.println("---column data---");
			List<WebElement> coldatta = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
			for (WebElement coldatta1 : coldatta) {
				System.out.println(coldatta1.getText());
				}
			System.out.println("---particular data---");
			List<WebElement> particulardata = driver.findElements(By.xpath("//table/tbody/tr[5]/td[2]"));
			for (WebElement particulardata1 : particulardata) {
				System.out.println(particulardata1.getText());
				}
			
			System.out.println("---Header---");
			List<WebElement> header = driver.findElements(By.tagName("th"));
			for (WebElement header1 : header) {
				System.out.println(header1.getText());
				
			}
		}
	
		
	}

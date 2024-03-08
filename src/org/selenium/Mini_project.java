package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement mailads = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mailads.sendKeys("suryaangappan1998@gmail.com");
		WebElement createacc = driver.findElement(By.id("SubmitCreate"));
		createacc.click();
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='top'])[2]"));
		gender.click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("surya");
		
		WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lastname.sendKeys("devi");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("surya@10");
		
		WebElement date = driver.findElement(By.id("days"));
		Select s=new Select(date);
		s.selectByValue("10");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1=new Select(month);
		s1.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2=new Select(year);
		s2.selectByValue("1998");
		
		WebElement labletxt = driver.findElement(By.xpath("//label[@for='optin']"));
		labletxt.click();
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("TNQ Technologies");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("102, TNQ Techlogy, Srp tools, Thiruvanmaiyur");
		
		WebElement address1 = driver.findElement(By.id("address2"));
		address1.sendKeys("367, Vgnapartment, Potheri");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3=new Select(state); 
		s3.selectByVisibleText("Indiana");
		
		WebElement postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("60041");
		
		WebElement additionalinformation = driver.findElement(By.id("other"));
		additionalinformation.sendKeys("nothing");
		
		WebElement mblno = driver.findElement(By.id("phone_mobile"));
		mblno.sendKeys("8838139179");
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		
		
		
		
		
		
	}

}



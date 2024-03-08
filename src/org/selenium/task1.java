package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr&guccounter=1&guce_referrer=aHR0cHM6Ly9sb2dpbi55YWhvby5jb20v&guce_referrer_sig=AQAAAITgOrcOTfyFpjpD0H8QL6czoE_0eEkXlQ6GK9gY16Ypp2Qd3TJzS3njgYshpvbnxuJNISHVftkHoa1HYKcfZeIoXHNeaci-BSUZhHVzQXyZeBvS1dmHJ40xWwqnrrY4SajZ6AZzDMKpX4bN_3hP9nWcXC72B9hLji71j8Rk8y-O");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//div[@title='Sign In']"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("login-username"));
		email.sendKeys("suryadevi10@yahoo.com");
		
		WebElement next = driver.findElement(By.name("signin"));
		next.click();
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("chn%8IOP");
		
		WebElement signin1 = driver.findElement(By.id("login-signin"));
		signin1.click();
		
		WebElement micon = driver.findElement(By.xpath("//div[@title='Mail']"));
		micon.click();
		
		WebElement compose = driver.findElement(By.xpath("//a[@role='button']"));
		compose.click();
		
		WebElement To = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));
		To.sendKeys("info@home.comms.yahoo.net");
		
		WebElement text = driver.findElement(By.xpath("//div[@role='textbox']"));
		text.sendKeys("Hi");
		
		WebElement mailsend = driver.findElement(By.xpath("(//button[@type='button'])[12]"));
		mailsend.click();
		
	
}
}

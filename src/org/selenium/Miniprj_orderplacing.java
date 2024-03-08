package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miniprj_orderplacing {
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
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("suryaangappan1998@gmail.com");
		WebElement passwrd = driver.findElement(By.id("passwd"));
		passwrd.sendKeys("surya@10");
		WebElement signinn = driver.findElement(By.id("SubmitLogin"));
		signinn.click();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		women.click();
		WebElement clkele = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
		clkele.click();
		
		WebElement addtocart = driver.findElement(By.name("Submit"));
		addtocart.click();
		
		WebElement proceedtochk = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceedtochk.click();
		
		WebElement proceedtochk1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceedtochk1.click();
		
		WebElement proceedtochk2 = driver.findElement(By.name("processAddress"));
		proceedtochk2.click();
		
		WebElement terms = driver.findElement(By.id("cgv"));
		terms.click();
		
		WebElement proceedtochk3 = driver.findElement(By.name("processCarrier"));
		proceedtochk3.click();
		
		WebElement bankdetail = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bankdetail.click();
		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		
		
	}
}
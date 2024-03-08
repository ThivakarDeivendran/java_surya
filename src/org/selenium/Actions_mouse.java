package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mouse {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", 
//				"C:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement Doubleclk = driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(Doubleclk).build().perform();
		WebElement doubleclkmsg = driver.findElement(By.id("doubleClickMessage"));
		String Doubletxt = doubleclkmsg.getText();
		System.out.println(Doubletxt);
		Thread.sleep(3000);
		
		WebElement rightclk = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(rightclk).build().perform();
		WebElement rightclkmsg = driver.findElement(By.id("rightClickMessage"));
		String rightclkxt = rightclkmsg.getText();
		System.out.println(rightclkxt);
		
		WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		a.click(clickme).build().perform();
		WebElement clickmsg = driver.findElement(By.id("dynamicClickMessage"));
		String Clicktxt = clickmsg.getText();
		System.out.println(Clicktxt);
		
		driver.navigate().to("https://www.amazon.com/");
		WebElement Movetogift = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		a.moveToElement(Movetogift).build().perform();
		
}
}

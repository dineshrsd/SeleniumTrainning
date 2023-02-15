package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A17 extends Set {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions A = new Actions(driver);
	WebElement click = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
	A.click(click).perform();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//img[@alt='Fashion']")).click();
	
	Thread.sleep(2000);
	WebElement applicn = driver.findElement(By.xpath("(//span[@class='_2I9KP_ _2WDRax'])[1]"));
	A.moveToElement(applicn).perform();
	
	
	
}
}

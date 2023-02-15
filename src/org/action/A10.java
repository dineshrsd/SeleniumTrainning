package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A10 extends Set {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com");
	Actions A = new Actions(driver);
	
	WebElement mobileaccess = driver.findElement(By.xpath("//span[normalize-space()='Mobile & Accessories']"));
	A.moveToElement(mobileaccess).perform();
	Thread.sleep(2000);
	WebElement topsell = driver.findElement(By.xpath("//span[normalize-space()='Top Selling Wearables']"));
	A.click(topsell).perform();
}
}

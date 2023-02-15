package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1 extends Set{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Actions A = new Actions(driver);
	
	WebElement Bank = driver.findElement(By.partialLinkText("BANK"));
	WebElement DsAcc = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	A.dragAndDrop(Bank, DsAcc).perform();
	
	WebElement amount = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
	WebElement Dsamount = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
	A.dragAndDrop(amount, Dsamount).perform();
	
	WebElement sales = driver.findElement(By.partialLinkText("SALES"));
	WebElement Csacc = driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
	A.dragAndDrop(sales, Csacc).perform();
	
	WebElement amount1 = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
	WebElement Csamount = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
	A.dragAndDrop(amount1, Csamount).perform();

	
}
}

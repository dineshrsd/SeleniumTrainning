package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A9 extends Set{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement alldept = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
	Actions A = new Actions(driver);
	A.moveToElement(alldept).perform();
	Thread.sleep(2000);
	WebElement paint = driver.findElement(By.xpath("//a[@class='MainFlyout__link'][normalize-space()='Paint']"));
	A.moveToElement(paint).perform();
	WebElement intpaint = driver.findElement(By.xpath("//a[@title='Interior Paint']"));
	A.moveToElement(intpaint).perform();
	WebElement celpaint = driver.findElement(By.xpath("//a[@title='Ceiling Paint']"));
	A.click(celpaint).perform();
}
}

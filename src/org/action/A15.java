package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A15 extends Set{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		Actions A = new Actions(driver);
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
		A.click(click).perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Fashion']")).click();
		
		Thread.sleep(2000);
		WebElement babtkids = driver.findElement(By.xpath("(//span[normalize-space()='Baby & Kids'])[1]"));
		A.moveToElement(babtkids).perform();
		
		Thread.sleep(2000);
		WebElement remotetoys = driver.findElement(By.xpath("//a[@title='Remote Control Toys']"));
		A.click(remotetoys).perform();
}
}
package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A3 extends Set{
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Actions A = new Actions(driver);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		 WebElement click = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
         A.click(click).perform();
		driver.manage().window().maximize();
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Home & Furniture']")).click();
		
		Thread.sleep(5000);
		WebElement homefur =driver.findElement(By.xpath("//span[normalize-space()='Home & Furniture']"));
		A.moveToElement(homefur).perform();
		
		Thread.sleep(5000);
		WebElement painting = driver.findElement(By.xpath("//a[@class='_3QN6WI'][normalize-space()='Paintings']"));
		System.out.println(painting.getText());

	}
}

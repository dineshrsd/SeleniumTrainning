package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A11 extends Set {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		Actions A = new Actions(driver);
		Thread.sleep(2000);
		WebElement womenfashion = driver.findElement(By.xpath("(//span[normalize-space()=\"Women's Fashion\"])[1]")) ;
		A.moveToElement(womenfashion).perform();
		Thread.sleep(2000);
		WebElement heels = driver.findElement(By.xpath("//span[normalize-space()='Heels']"));
		A.click(heels).perform();
}
	
}
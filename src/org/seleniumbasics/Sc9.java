package org.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc9 extends Setprty {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.linkText("Login")).submit();
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("999888877776");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dinesh123");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
}
}

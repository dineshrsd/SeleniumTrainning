package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc14 extends Setprty{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Inmakes learning hub");
	driver.findElement(By.xpath("(//span[normalize-space()='inmakes learning hub'])[1]")).click();
	
}
}

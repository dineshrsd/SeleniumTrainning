package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc4 extends Setprty{
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dinesh@gmail.com");
		driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("123123");
		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();

	}
}

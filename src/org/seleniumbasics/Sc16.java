package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc16 extends Setprty{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("iphone");
		driver.findElement(By.xpath("//ul[@id='search-result']")).click();
	}
}

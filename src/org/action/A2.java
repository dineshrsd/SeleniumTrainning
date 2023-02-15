package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A2 extends Set{
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		Actions A = new Actions(driver);
		WebElement prime = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		A.moveToElement(prime).perform();
	}
}

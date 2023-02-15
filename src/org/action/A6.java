package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A6 extends Set{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://lh.inmakesedu.com/home");
	driver.manage().window().maximize();
	Actions A = new Actions(driver);
	
	WebElement course = driver.findElement(By.xpath("//a[@id='navbarDropdown']"));
	A.moveToElement(course).perform();
	
	WebElement swtest = driver.findElement(By.xpath("//p[normalize-space()='Software Testing Tamil']"));
	A.moveToElement(swtest).perform();
	
	WebElement advclass = driver.findElement(By.xpath("//a[normalize-space()='ST Advanced class']"));
	A.click(advclass).perform();
}
}

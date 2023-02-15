package org.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc3 extends Setprty {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

	driver.findElement(By.id("nav-search-submit-button")).click();
}
}
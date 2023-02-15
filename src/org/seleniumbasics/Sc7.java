package org.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc7 extends Setprty{
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("i-icon-profile")).click();
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
}
}

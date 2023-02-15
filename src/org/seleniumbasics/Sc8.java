package org.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc8 extends Setprty {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.cleartrip.com/trains");
	driver.findElement(By.id("from_station")).sendKeys("chennai");
	driver.findElement(By.id("to_station")).sendKeys("banglore");
	driver.findElement(By.id("trainClass")).click();
	driver.findElement(By.xpath("//option[@value='1A']")).click();
	
	driver.findElement(By.xpath("//img[@title='Click to open calendar']")).click();
	driver.findElement(By.linkText("21")).click();
	
	driver.findElement(By.id("train_adults")).click();
	driver.findElement(By.xpath("//option[@selected='selected'][normalize-space()='1']")).click();
	
	driver.findElement(By.id("trainFormButton")).click();
	
}
}

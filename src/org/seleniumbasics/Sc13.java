package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc13 extends Setprty{
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://inmakesedu.com");
	WebElement address = driver.findElement(By.xpath("//div[@class='col-lg-3 col-md-6 col-sm-6']//li[1]//a[1]"));
	System.out.println("ADDRESS :");
	System.out.println(address.getText());
	WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='00971502509410']"));
	System.out.println("phone :"+phone.getText());
	
	
}
}

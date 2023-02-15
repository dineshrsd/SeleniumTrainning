package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc12 extends Setprty{
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://inmakesedu.com/about_us");
	
	WebElement headline = driver.findElement(By.xpath("//h2[normalize-space()='Inmakes learning hub']"));
	System.out.println(headline.getText());
	WebElement para = driver.findElement(By.xpath("//p[contains(text(),'Inmakes learning hub is a part of the inmakes soft')]"));
    System.out.println(para.getText());

}
}

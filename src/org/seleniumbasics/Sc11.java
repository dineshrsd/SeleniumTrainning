package org.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc11 extends Setprty{
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://inmakesedu.com");
		WebElement headline = driver.findElement(By.xpath("//h1[normalize-space()='Learning Today For A Better Tomorrow']"));
		System.out.println(headline.getText());

		WebElement para1 = driver.findElement(By.xpath("//p[contains(text(),'When you learn a brand-new skill, you open up more')]"));
		System.out.println(para1.getText());

		WebElement para2 = driver.findElement(By.xpath("//p[contains(text(),'We are providing a wide range of professional educ')]"));
		System.out.println(para2.getText());

	}
}

package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A8 extends Set{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement alldept = driver.findElement(By.xpath("//a[contains(text(),'All Departments')]"));
		Actions A = new Actions(driver);
		A.moveToElement(alldept).perform();
		Thread.sleep(2000);
		WebElement heatandcool = driver.findElement(By.xpath("//a[@class='MainFlyout__link'][normalize-space()='Heating & Cooling']"));
		A.moveToElement(heatandcool).perform();
		Thread.sleep(2000);
		WebElement aircon = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		A.moveToElement(aircon).perform();
		Thread.sleep(2000);
		WebElement portair = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		A.click(portair).perform();

	}
}

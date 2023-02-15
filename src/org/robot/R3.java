package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class R3 extends Set{
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	Actions A = new Actions(driver);

	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.linkText("Login")).click();
	Thread.sleep(10000);
	WebElement email = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	email.sendKeys("dinesh");
	Robot R = new Robot();
	A.doubleClick(email).perform();
	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_C);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_C);
	Thread.sleep(2000);

	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	 A.click(pass).perform();
	 R.keyPress(KeyEvent.VK_CONTROL);
	 R.keyPress(KeyEvent.VK_V);
	 R.keyRelease(KeyEvent.VK_CONTROL);
	 R.keyRelease(KeyEvent.VK_V);
	 
	 
}
}

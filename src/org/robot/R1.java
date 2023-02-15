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

public class R1 extends Set  {
public static void main(String[] args) throws AWTException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("rajdinesh");
	Robot R = new Robot();
	Actions A = new Actions(driver);
	A.doubleClick(email).perform();
	//A.contextClick(email).perform();
	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_C);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_C);

 WebElement pass = driver.findElement(By.id("pass"));
 A.click(pass).perform();
 R.keyPress(KeyEvent.VK_CONTROL);
 R.keyPress(KeyEvent.VK_V);
 R.keyRelease(KeyEvent.VK_CONTROL);
 R.keyRelease(KeyEvent.VK_V);
 
 
	
	
	
}
}

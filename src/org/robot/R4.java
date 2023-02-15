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

public class R4 extends Set{
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Sign in")).click();
	
	WebElement email = driver.findElement(By.id("ap_email"));
	email.sendKeys("rajdinesh_gmail_com");
	Actions A = new Actions(driver);
	A.doubleClick(email).perform();
	A.contextClick(email).perform();
	Robot R = new Robot();
	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_X);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyRelease(KeyEvent.VK_X);
}
}

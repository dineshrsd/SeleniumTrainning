package org.robot;

import java.awt.AWTException;
import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class R2 extends Set {
public static void main(String[] args) throws AWTException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	WebElement serchbox = driver.findElement(By.name("q"));
	serchbox.sendKeys("Inmakes_Infotech");
	Actions a = new Actions(driver);
	a.doubleClick(serchbox).perform();
	

	
}
}

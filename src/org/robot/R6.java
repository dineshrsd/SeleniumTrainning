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

public class R6 extends Set{
public static void main(String[] args) throws AWTException, InterruptedException {
	
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//button[contains(text(),'✕')])[1]")).click();
Thread.sleep(2000);
WebElement elec = driver.findElement(By.xpath("(//img[@alt='Electronics'])[1]"));
Actions A = new Actions(driver);
A.contextClick(elec).perform();
Robot R = new Robot();

R.keyPress(KeyEvent.VK_DOWN);
R.keyRelease(KeyEvent.VK_DOWN);
R.keyPress(KeyEvent.VK_DOWN);
R.keyRelease(KeyEvent.VK_DOWN);
R.keyPress(KeyEvent.VK_DOWN);
R.keyRelease(KeyEvent.VK_DOWN);
R.keyPress(KeyEvent.VK_DOWN);
R.keyRelease(KeyEvent.VK_DOWN);
R.keyPress(KeyEvent.VK_DOWN);
R.keyRelease(KeyEvent.VK_DOWN);
R.keyPress(KeyEvent.VK_ENTER);
R.keyRelease(KeyEvent.VK_ENTER);
R.keyPress(KeyEvent.VK_ENTER);
R.keyRelease(KeyEvent.VK_ENTER);

}
}

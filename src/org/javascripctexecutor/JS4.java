package org.javascripctexecutor;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS4 extends Set{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement email = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','dinesh@gmail')", email);
	js.executeScript("arguments[0].setAttribute('value','123456')", pass);
	WebElement click = driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click()", click);


}
}

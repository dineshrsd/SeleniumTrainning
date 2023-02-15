package org.javascripctexecutor;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS2 extends Set{
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://toolsqa.com/");
	driver.manage().window().maximize();
	driver.get("https://toolsqa.com/");
	WebElement Scrolldown = driver.findElement(By.xpath("(//a[contains(text(),'Tutorials')])[1]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",Scrolldown );
	
	WebElement scrollup = driver.findElement(By.xpath("//div[@class='new-training__heading']"));
	js.executeScript("arguments[0].scrollIntoView(false)",scrollup);
}
}

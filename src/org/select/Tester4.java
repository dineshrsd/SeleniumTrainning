package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumbasics.Setprty;

public class Tester4 extends Setprty {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("file:///C:/Users/rider44/Documents/tables.html");
	
	WebElement javaListbox = driver.findElement(By.id("java"));
	
	Select select = new Select(javaListbox);
	
	List<WebElement> options = select.getOptions();
	
	for (WebElement option : options) {
		select.selectByVisibleText(option.getText());
        Thread.sleep(3000);	
	
	}
	
	
	
	
}
		
}

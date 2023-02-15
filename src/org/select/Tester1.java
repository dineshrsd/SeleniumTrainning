package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumbasics.Setprty;

public class Tester1 extends Setprty {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/rider44/Documents/tables.html");
	
	 WebElement java = driver.findElement(By.id("java"));
	
	 Select select = new Select(java);
	 List<WebElement> options = select.getOptions();

     System.out.println("Count of options :"+options.size()); 
     
     for (WebElement option : options) {
		System.out.println(option.getText());
	}
}
}

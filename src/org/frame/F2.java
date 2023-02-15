package org.frame;

import org.action.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2 extends Set{
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.findElement(By.className("login_button")).click();
	driver.findElement(By.id("Button2")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
}
}

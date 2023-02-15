package org.alert;

import org.action.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 extends Set {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
}
}

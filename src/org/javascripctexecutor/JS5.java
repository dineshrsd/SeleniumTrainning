package org.javascripctexecutor;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS5 extends Set{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement usname = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','dineshrsd')", usname);
		js.executeScript("arguments[0].setAttribute('value','123123')", pass);
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);


	}
	}


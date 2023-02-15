package org.javascripctexecutor;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS6 extends Set{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','din123')", email);
		js.executeScript("arguments[0].setAttribute('value','999888777')", pass);
		WebElement login = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);


	}
	}


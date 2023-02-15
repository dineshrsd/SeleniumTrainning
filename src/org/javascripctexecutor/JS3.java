package org.javascripctexecutor;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS3 extends Set{
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");
		driver.manage().window().maximize();
		WebElement course = driver.findElement(By.xpath("//h2[normalize-space()='Start as a trainee.. Exit as a professional']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",course );
	    
	}
	}



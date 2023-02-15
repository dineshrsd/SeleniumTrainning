package org.javascripctexecutor;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS1 extends Set{
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://inmakesedu.com/");
	driver.manage().window().maximize();
	WebElement inmake = driver.findElement(By.xpath("//img[@src='assets/img/white-logo.png']"));
	WebElement inmakepara = driver.findElement(By.xpath("(//p[contains(text(),'Inmakes offer various kinds of products and servic')])[1]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)",inmake );
    System.out.println(inmakepara.getText());
}
}

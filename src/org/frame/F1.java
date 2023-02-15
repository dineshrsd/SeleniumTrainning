package org.frame;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1 extends Set{
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://online.canarabank.in/?module=login");
		driver.manage().window().maximize();
		Thread.sleep(15000);
		WebElement login = driver.findElement(By.xpath("//span[@id='ui-id-15']"));
		login.click();
		WebElement username = driver.findElement(By.name("username"));
		System.out.println(username.getText());

	}
}

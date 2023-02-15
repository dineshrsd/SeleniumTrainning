package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumbasics.Setprty;

public class Tester15 extends Setprty{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();

		WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]"));
		username.sendKeys("rajdinesh637@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]"));
		password.sendKeys("12211635d");		

		driver.findElement(By.xpath("//button[text()='Login']")).click();

		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();


		driver.findElement(By.linkText("Add Desired Location")).click();

		driver.findElement(By.id("locDroopeFor")).click();

       List<WebElement> options = driver.findElement(By.id("ul_locDroope")).findElements(By.tagName("a"));

for (WebElement option : options) {
	option.click();
	Thread.sleep(2000);
	option.click();
}


	}
}
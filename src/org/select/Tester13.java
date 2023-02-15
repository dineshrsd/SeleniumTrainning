package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumbasics.Setprty;

public class Tester13 extends Setprty{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://wwww.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();

		WebElement monthlistbox = driver.findElement(By.id("month"));

		Select select = new Select(monthlistbox);
		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {
			select.selectByVisibleText(option.getText());
			Thread.sleep(1000);
		}

	}
}

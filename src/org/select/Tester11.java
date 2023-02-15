package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumbasics.Setprty;

public class Tester11 extends Setprty {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/rider44/Documents/tables.html");

		WebElement manualListbox = driver.findElement(By.id("manual"));

		Select select = new Select(manualListbox);

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
		}


		for (int i = 0; i < options.size(); i++) {
			select.deselectByIndex(i);
			Thread.sleep(3000);
		}


	}

}

package org.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumbasics.Setprty;

public class Tester10 extends Setprty {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/rider44/Documents/tables.html");

		WebElement manualListbox = driver.findElement(By.id("manual"));

		Select select = new Select(manualListbox);

		List<WebElement> options = select.getOptions();

		for (WebElement option : options) {
			select.selectByValue(option.getAttribute("value"));
			Thread.sleep(3000);	
		}
		for (WebElement option  : options) {
			select.deselectByValue(option.getAttribute("value"));
			Thread.sleep(3000);	
		}




	}

}

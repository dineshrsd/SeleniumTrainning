package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A5 extends Set {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions A = new Actions(driver);
		WebElement sprsmor = driver.findElement(By.xpath("//a[normalize-space()='Sports & More']"));
		A.moveToElement(sprsmor).perform();
		Thread.sleep(2000);
		WebElement weightgai = driver.findElement(By.xpath("//a[@alt='Home|CT4P2|Sports & M|NA|Diet Nutrition|Weight Gainers|NA|NA|CT@Weight Gainers']"));
		A.click(weightgai).perform();
	}
}

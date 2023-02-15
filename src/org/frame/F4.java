package org.frame;

import org.action.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4 extends Set{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");


		WebElement frame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frame);

		Thread.sleep(2000);
		WebElement uname = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		uname.sendKeys("122116");

		driver.findElement(By.linkText("CONTINUE")).click();

		WebElement psw = driver.findElement(By.xpath("//input[@id='fldPasswordDispId']"));
		psw.sendKeys("12345");

}
}
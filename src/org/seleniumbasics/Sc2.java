package org.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc2 extends Setprty{
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();

	}
}

package org.takescreenshoot;

import java.io.File;
import java.io.IOException;

import org.action.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS3 extends Set {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File F = new File("C:\\Users\\rider44\\eclipse-workspace\\Selenium\\errorshots\\amazonhome.png");
		FileUtils.copyFile(img, F);

	}
}

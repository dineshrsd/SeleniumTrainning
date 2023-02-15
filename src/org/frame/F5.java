package org.frame;

import org.action.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F5 extends Set{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga=2.31482300.320869951.1672130362-1743088052.1672130362&_gl=1*lvyycj*_ga*MTc0MzA4ODA1Mi4xNjcyMTMwMzYy");
	driver.manage().window().maximize();
	
	//WebElement userclick = driver.findElement(By.xpath("(//input[@id='DUMMY1'])[1]"));
	//userclick.click();
	//Thread.sleep(2000);
	WebElement userid = driver.findElement(By.id("DUMMY1"));
	userid.sendKeys("12345");
	userid.click();
	WebElement psw = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
	psw.sendKeys("abcde");
	driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
}
}

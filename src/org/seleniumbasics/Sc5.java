package org.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sc5 extends Setprty{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dinesh");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("raja");
	driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("28 mound road chennai,tamilnadu");
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dineshrsd88@gmail.com");
    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999665541");
    driver.findElement(By.xpath("//input[@value='Male']")).click();
    driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
    driver.findElement(By.xpath("//div[@id='msdd']")).click();
    driver.findElement(By.linkText("English")).click();
    driver.findElement(By.xpath("//body/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]")).click();
    driver.findElement(By.xpath("//select[@id='Skills']")).click();
    driver.findElement(By.xpath("//option[@value='Software']")).click();
    driver.findElement(By.xpath("//body/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]")).click();

    driver.findElement(By.xpath("//span[@role='combobox']")).click();
    driver.findElement(By.xpath("//li[normalize-space()='India']")).click();
    driver.findElement(By.xpath("//body/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]")).click();

    driver.findElement(By.xpath("//select[@id='yearbox']")).click();
    driver.findElement(By.xpath("//option[@value='1995']")).click();
    driver.findElement(By.xpath("//body/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]")).click();
  
    driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
    driver.findElement(By.xpath("//option[@value='August']")).click();
    driver.findElement(By.xpath("//body/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]")).click();

    driver.findElement(By.xpath("//select[@id='daybox']")).click();
    driver.findElement(By.xpath("//option[@value='13']")).click();
    driver.findElement(By.xpath("//body/section[@id='section']/div[@class='container center']/div[contains(@class,'row')]/div[@class='col-sm-6 col-md-6 col-xs-12']/form[@id='basicBootstrapForm']/div[1]")).click();

    driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456");
    driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456");
    
    driver.findElement(By.id("submitbtn")).click();
}
}

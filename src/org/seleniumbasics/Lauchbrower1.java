package org.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauchbrower1 extends Setprty{
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S453545015%3A1671419439820955&continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F8494%3Fhl%3Den%26co%3DGENIE.Platform%253DDesktop&ec=GAZAdQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh4NrWHnBSU6cyqx2yVEF3YZZAxqQg2DvUWKIsqZIkPGx-AnY4QzOOVO8nv955Y1g565EBQeWQ");
	
}
}

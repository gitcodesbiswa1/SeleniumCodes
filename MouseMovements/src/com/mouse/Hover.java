package com.mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover {
	
	@Test
	public void hoverCheck() throws InterruptedException {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.easemytrip.com/");
		
		Actions act= new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//a[@class='_btnclick']"))).build().perform();
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//span[normalize-space()='Customer Login']")).click();
		Thread.sleep(3000);
		dr.quit();
		
	}
}

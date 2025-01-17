package com.multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiFrameTest {
	WebDriver dr;
	
	@Test
	public void countframes() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("C:\\Users\\Administrator\\Desktop\\Selenium Practice\\Multiframe\\htmlfile\\frame.html");
		Thread.sleep(5000);
		
		int totalnoofframes= dr.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames "+ totalnoofframes);
		
		
		dr.switchTo().frame("HollandandBarrett");
		dr.get("https://auth.hollandandbarrett.com/u/login");
		dr.findElement(By.id("username")).sendKeys("biswajitstudy8@gmail.com");
		dr.findElement(By.name("password")).sendKeys("SuperEpicPub@25");
		dr.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
		
		
		dr.navigate().to("C:\\\\Users\\\\Administrator\\\\Desktop\\\\Selenium Practice\\\\Multiframe\\\\htmlfile\\\\frame.html");
		Thread.sleep(5000);
		dr.findElement(By.xpath("/html/body/a"));
		
		dr.navigate().to("https://www.selenium.dev/");
		
	}
	
	
}

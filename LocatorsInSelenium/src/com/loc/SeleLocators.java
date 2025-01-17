package com.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleLocators {
	@Test
	public void ExampleId() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://auth.hollandandbarrett.com/u/login");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.findElement(By.id("username")).sendKeys("biswajitstudy8@gmail.com");
		dr.findElement(By.name("password")).sendKeys("SuperEpicPub@25");
		dr.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
		Thread.sleep(5000);
		dr.quit();
	}
	
	@Test
	public void WebElementsEnabled() throws Exception{
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://auth.hollandandbarrett.com/u/login");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		Boolean enabled= dr.findElement(By.id("username")).isEnabled();
		System.out.println(enabled);
		Thread.sleep(2000);
		dr.quit();
	}
	
	@Test
	public void WebElementsSelected() throws Exception{
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://auth.hollandandbarrett.com/u/login");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		Boolean selected= dr.findElement(By.id("username")).isSelected();
		System.out.println(selected);
		Thread.sleep(2000);
		dr.quit();
	}
}

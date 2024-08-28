package com.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameDemo {
	@Test
	public void ExampleClassName() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.hollandandbarrett.com/basket");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		boolean displayed=dr.findElement(By.className("ProductCard-module_productImage__7VPgE")).isDisplayed();
		System.out.println(displayed);
		dr.quit();
	}
}

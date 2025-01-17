package com.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameDemo {
	@Test
	public void exampleTagName() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://auth.hollandandbarrett.com/u/login");
		dr.manage().window().maximize();
		
		String tagname= dr.findElement(By.id("username")).getTagName();
		System.out.println(tagname);
		//Thread.sleep(4000);
		dr.quit();
	}
}

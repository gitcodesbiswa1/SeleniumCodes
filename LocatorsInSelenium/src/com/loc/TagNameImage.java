package com.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameImage {
	@Test
	public void exampleTagName() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://auth.hollandandbarrett.com/u/login");
		dr.manage().window().maximize();
		
		String ts1= dr.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(ts1);
		//Thread.sleep(4000);
		dr.quit();
	}
}


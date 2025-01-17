package com.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void ddcheck() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/campaign/landing.php");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		WebElement month = dr.findElement(By.id("month"));
		Select month_dd= new Select(month);
		month_dd.selectByIndex(1);
		Thread.sleep(2000);
		month_dd.selectByValue("8");
		Thread.sleep(2000);
		month_dd.selectByVisibleText("Dec");
		Thread.sleep(2000);
		dr.quit();
	}
}

package com.loc;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SameClassMultiEle {
	@Test
	public void ExampleClassName() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.hollandandbarrett.com/basket");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		List<WebElement> elements = dr.findElements(By.className("ProductCard-module_productImage__7VPgE"));
		for(WebElement element: elements) {
			System.out.println(element);
		}
		dr.quit();
}
}

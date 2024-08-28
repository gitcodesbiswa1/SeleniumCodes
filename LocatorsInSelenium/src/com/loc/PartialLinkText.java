package com.loc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.input.model.DragData;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkText {
	WebDriver dr;
	int total=0;
	@BeforeTest
	public void PlTextSetup() {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		dr= new ChromeDriver();
		
		dr.manage().window().maximize();
	}
	
	@Test
	public void PlText() throws Exception {
		dr.navigate().to("https://www.hollandandbarrett.com/");

		Thread.sleep(5000);
		dr.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		dr.findElement(By.linkText("Vitamins & Supplements")).click();
		
		List<WebElement> links= dr.findElements(By.xpath("//a"));
		int linkcount= links.size();
		total=total+linkcount;
		System.out.println("Number of links "+linkcount);
		for(int i=0;i<linkcount;i++) {
			System.out.println(links.get(i).getText());
		}
		dr.quit();
		
	}
}

package com.handlealerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {
	@Test
	public void Alertpopup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert alert= dr.switchTo().alert();
		
		Thread.sleep(5000);
		alert.accept();
		String result = dr.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked an alert",result);
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert2=dr.switchTo().alert();
		alert2.dismiss();
		String result2= dr.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Cancel", result2);
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert3=dr.switchTo().alert();
		alert2.accept();
		String result3= dr.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You clicked: Ok", result3);
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		dr.switchTo().alert().sendKeys("Biswajit Jena");
		Thread.sleep(5000);
		dr.switchTo().alert().accept();
		String result4= dr.findElement(By.cssSelector("#result")).getText();
		System.out.println(result4);
		Assert.assertEquals("You entered: Biswajit Jena", result4);
		
		dr.quit();
	}
}

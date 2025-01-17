package com.handlealerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReddiffAlert {
	@Test
	public void TestPopups() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		dr.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert= dr.switchTo().alert();
		System.out.println(alert.getText());
		
		String txt= alert.getText();
		
		if(txt.equals("Please enter a valid user name"))
			System.out.println("correct alert message");
		else {
			System.out.println("Incorrect alert message");
		}
	}
}

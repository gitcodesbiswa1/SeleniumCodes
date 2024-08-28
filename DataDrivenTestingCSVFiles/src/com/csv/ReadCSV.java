package com.csv;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {
	String csvpath="./CSVDATA/SeleniumTest.csv";
	WebDriver dr;
	@BeforeTest
	public void setup() {
			
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://only-testing-blog.blogspot.com/2014/05/form.html");
	}
	@Test
	public void rdcsv() throws Exception {
		CSVReader rd= new CSVReader(new FileReader(csvpath));
		String[] csvCell;
		while((csvCell=rd.readNext())!=null) {
			String fname= csvCell[0];
			String lname= csvCell[1];
			String email= csvCell[2];
			String mnumb= csvCell[3];
			String Cname= csvCell[4];
			
			dr.findElement(By.name("FirstName")).sendKeys(fname);
			dr.findElement(By.name("LastName")).sendKeys(lname);
			dr.findElement(By.name("EmailID")).sendKeys(email);
			dr.findElement(By.name("MobNo")).sendKeys(mnumb);
			dr.findElement(By.name("Company")).sendKeys(Cname);
			
			Thread.sleep(3000);
			dr.findElement(By.xpath("//*[@id=\"post-body-8228718889842861683\"]/div[1]/form/input[6]")).click();
			Thread.sleep(3000);
			dr.switchTo().alert().accept();
		}
		rd.close();
	}
		
		@AfterTest
		public void afterRunning() 
		{
			dr.quit();
		}
}

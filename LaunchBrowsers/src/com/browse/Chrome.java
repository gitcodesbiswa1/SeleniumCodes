package com.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Chrome {
	WebDriver drive;
	
	@Test(priority=1)
	public void ChromeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriverJars\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		drive.quit();
	}
	@Test(priority=2)
	public void FirefoxBrowserLaunch() throws Exception{
		System.setProperty("webdriver.gecko.driver",".\\FirefoxDriverJars\\geckodriver.exe");
		drive= new FirefoxDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		drive.quit();
	}
	@Test(priority=3)
	public void EdgeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.edge.driver",".\\EdgeBrowserJars\\msedgedriver.exe");
		drive= new EdgeDriver();
		drive.get("https://auth.hollandandbarrett.com/u/login");
		drive.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(drive.getTitle());
		drive.quit();
	}
	
/*	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selenium Practice\\LaunchBrowsers\\ChromeDriverJars\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.get("https://www.hollandandbarrett.com/my-account/overview");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		dr.manage().window().minimize();
		Thread.sleep(3000);
		dr.quit();
	}*/

}

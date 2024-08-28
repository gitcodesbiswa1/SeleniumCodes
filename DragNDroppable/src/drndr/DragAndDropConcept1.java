package drndr;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilityDriver.Helper;

public class DragAndDropConcept1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = Helper.startBrowser("Chrome");
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Thread.sleep(2000);
		a.clickAndHold(source).moveToElement(des).release(des).perform();
	}
}


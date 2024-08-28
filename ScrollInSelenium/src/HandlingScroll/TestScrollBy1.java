package HandlingScroll;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class TestScrollBy1 {
	WebDriver dr;
	String url="https://www.spicejet.com/";
	
	@Test
	public void Test() throws Exception{
		System.setProperty("webdriver.chrome.driver","./ChromeDriverJars/chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get(url);
		
		((JavascriptExecutor)dr).executeScript("scroll(0,1200)");
		Thread.sleep(4000);
		((JavascriptExecutor)dr).executeScript("window.scrollBy(0,-1400)");

	}
}

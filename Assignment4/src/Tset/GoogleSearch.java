package Tset;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch {
	WebDriver dr;
	String url="https://www.google.com";
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","E://driver//chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

	
	@After
	public void tearDown() throws Exception {
		//dr.quit();
	}

	@Test
	public void test() throws InterruptedException {
dr.findElement(By.name("a")).sendKeys("Selenium");
		
		List<WebElement> wb = dr.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	
		for (int i =0;i<wb.size();i++){
			String str = wb.get(i).getText();
		    if(str.equals("Selenium webdriver")){
		    	wb.get(i).click();
		    	Thread.sleep(5000);
		    	break;
		    }
		}
		
	}

}

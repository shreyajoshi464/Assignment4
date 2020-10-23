package Tset;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {
	WebDriver dr;
	String url="http://openclininc.sourceforge.net/openclinic/home/index.php";
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		JavascriptExecutor java = (JavascriptExecutor)dr;
		java.executeScript("window.scrollBy(0,1000)");
	}

}

package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingDemo {
	
	@Test
	public void test(){
		System.out.println("I am Rajdeep. I am testing selenium jenkins integration...");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowdhur\\.m2\\repository\\pl\\oakfusion\\chromedriver\\2.9\\chromedriver-2.9\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Title: " + driver.getTitle());
	}

}

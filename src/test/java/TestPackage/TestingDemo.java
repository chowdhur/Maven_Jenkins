package TestPackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class TestingDemo {
	
	@Test
	public void test(){
		System.out.println("I am Rajdeep. I am testing selenium jenkins integration...");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\chowdhur\\.m2\\repository\\pl\\oakfusion\\chromedriver\\2.9\\chromedriver-2.9\\windows\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		/*ProfilesIni prof = new ProfilesIni();
		FirefoxProfile firefoxProfile = prof.getProfile("Rajdeep");
		      
		WebDriver driver = new FirefoxDriver(firefoxProfile);
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rajdeepdeepbkp@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("i(love)usomuch!!!");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		System.out.println("Title: " + driver.getTitle());*/
	}

}

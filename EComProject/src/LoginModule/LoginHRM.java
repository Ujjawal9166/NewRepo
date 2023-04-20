package LoginModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginHRM {

	WebDriver driver;
	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

	//	driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.quit();
	}
}

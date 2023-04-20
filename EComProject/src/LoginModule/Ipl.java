package LoginModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ipl {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws AWTException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
			driver.get("https://www.jiocinema.com/");
			WebElement watch = driver.findElement(By.xpath("(//p[text()='Watch'])[1]"));
			Actions a=new Actions(driver);
			a.doubleClick(watch).perform();
			Robot r=new Robot();
			Thread.sleep(15000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_F);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
	}


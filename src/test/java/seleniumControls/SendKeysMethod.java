package seleniumControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysMethod {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumPower\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	   WebElement ele= driver.findElement(By.className("gLFyf"));
	   ele.sendKeys("iphone 10");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	
	}

}

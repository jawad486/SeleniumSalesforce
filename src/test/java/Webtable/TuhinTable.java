package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TuhinTable {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumPower\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //opening the url
	    driver.get("file:///C:/Users/User/Desktop/tuhin.html");
	  // String st= driver.findElement(By.xpath("//table/tbody/tr[1]/th[1]")).getText();
	   String st= driver.findElement(By.xpath("//table/tbody//tr[4]/td[2]")).getText();
	   System.out.println(st);
	   
	 List  colunmNo= driver.findElements(By.xpath("//table/tbody//tr[1]/th"));
	    System.out.println("No of column"+" "+colunmNo.size());
	    
	    List <WebElement> rowsNo= driver.findElements(By.xpath("//table/tbody//tr"));
	    System.out.println("No of rows"+" "+rowsNo.size());

	}

}

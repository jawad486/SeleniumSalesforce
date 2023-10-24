package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumPower\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //opening the url
	    driver.get("C:\\Users\\User\\eclipse-workspace\\SeleniumSaleforce\\table.html");
	 String st=driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
	 System.out.println(st);
	 
	List <WebElement>rows= driver.findElements(By.xpath("//table/tbody/tr"));
	System.out.println("Rows:"+rows.size());
	
	
	List <WebElement>columns=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
	System.out.println("columns:"+columns.size());
	  
	}

}

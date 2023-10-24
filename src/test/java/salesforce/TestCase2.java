package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumPower\\driver\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //opening the url
	    driver.get("https://login.salesforce.com/");
	    
	    //verifying the appliction
	    String expectedTitle="Login | Salesforce";
	    String acutalTitle=driver.getTitle();
		
		  if(acutalTitle.equalsIgnoreCase(acutalTitle)) {
		  System.out.println("The Title of the appliction is== "+acutalTitle+"Test case pass"); 
		  }
		  else {
		  System.out.println("The title of the application is wrong Test case fail"); }
		 
	    
	    //username field
        WebElement usr=driver.findElement(By.id("username"));
        usr.sendKeys("jawadqureshi718@gmail.com");
        
       
        
       //passwor field
	   WebElement pass= driver.findElement(By.id("password"));
	   pass.clear();
	   pass.sendKeys("Admin12345");
	   
	   
	   //clicking on login button
	   WebElement loginButton=  driver.findElement(By.id("Login"));
	   loginButton.click();
	   
	   //verifying the home page title 
	   String expected="Home Page ~ Salesforce - Developer Edition";
	   String actual=driver.getTitle();
	   
	   if(actual.equalsIgnoreCase(expected)) {
		   System.out.println("The title of the home is corret || Test case pass");
		   
		    }else {
		    	System.out.println("The title of the home is worng || Test case fail");
		    }

	}

}

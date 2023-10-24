package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase_1_LoginErrorMessage {

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
        usr.sendKeys("ali");
        //verification
        if (usr.isDisplayed()) {
        	System.out.println("The username field is displayed || Test case pass");
        }
        else {
        	System.out.println("The username field is not displayed || Test case fail");
        }
       
        
       //passwor field
	   WebElement pass= driver.findElement(By.id("password"));
	   pass.clear();
	   pass.sendKeys("");
	   
	   //verifying password field is empty
	   
	   String passEmpty= driver.findElement(By.id("password")).getText();
	  
	   if (passEmpty.isEmpty()) {
		   System.out.println("The password field is empty || Test case pass");
	   }
	   else {
		   System.out.println("The password field is not empty || Test case fail");
	   }
	   
	   //clicking on login button
	   WebElement loginButton=  driver.findElement(By.id("Login"));
	   loginButton.click();
	   
	   String expected="Please enter your password.";
	   String actual= driver.findElement(By.id("error")).getText();
	   if(actual.equalsIgnoreCase(expected)) {
		   System.out.println("Please enter your password message is displayed || Test Pass");
	   }
	   else {
		   System.out.println("\"Please enter your password message is not displayed || Test failed");
	   }
	  
	}

}

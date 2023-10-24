package salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckMeTestCase3 {

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
        
       
    try {
		Thread.sleep(2000)  ;
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
       //passwor field
	   WebElement pass= driver.findElement(By.id("password"));
	   pass.clear();
	   pass.sendKeys("Admin12345");
	   
	   //click checkbox
	  WebElement checkBox=driver.findElement(By.id("rememberUn"));
	  checkBox.click();
	  
	   
	   
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

	   //clicking on dropdown
	    WebElement dropdownbutton=driver.findElement(By.id("userNavLabel"));
	    dropdownbutton.click();
	    
	    //clicking on the logout button
	   WebElement logoutButton=  driver.findElement(By.linkText("Logout"));
	   logoutButton.click();
	   
	   //validating the username name field
	   
   try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	   String expected1="jawadqureshi718@gmail.com";
	   String userField= driver.findElement(By.xpath("//*[@id='idcard-identity']")).getText();
	   if(userField.equalsIgnoreCase(expected1)) {
		   System.out.println("The user name is displayed || Test pass");
	   }else {
		   System.out.println("The user name is not displayed || Test field");
	   }
	
	   
	}

}

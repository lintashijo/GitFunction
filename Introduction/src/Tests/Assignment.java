package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\chromedriver.exe");
				  
				  WebDriver driver = new ChromeDriver();
				  
				  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			      driver.findElement(By.id("checkBoxOption2")).click();	
			      
			      String value = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
			      System.out.println(value);
			      Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
			      
			      s.selectByVisibleText(value);
			      driver.findElement(By.id("name")).sendKeys(value);
			      driver.findElement(By.id("alertbtn")).click();
			      
			      
			      System.out.println(driver.switchTo().alert().getText());
			      String popup = driver.switchTo().alert().getText();
			      driver.switchTo().alert().accept();
			     
			      
			      if(popup.contains(value)) {
			    	  
			    	  System.out.println("Alert success");
			    	  
			    	  
			      }
			      else {
			    	  System.out.println("somthing wrong");
			      }
			      
			      
			      
			      
			      
				  

	}

}
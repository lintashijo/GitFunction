package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\chromedriver.exe");
				  
				  WebDriver driver = new ChromeDriver();
				  
				  driver.get("https://www.amazon.com/");
				  
				  Actions a = new Actions(driver);
				 
				  WebElement move =driver.findElement(By.id("nav-link-accountList"));
				  a.moveToElement(move).build().perform();
				  a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("coats")
				  .build().perform();
				
				  
				     driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
				  //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
				 // driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
				
				  
				//  a.moveToElement(driver.findElement(By.id("nav-search-submit-text"))).click().build().perform();
				  
				  //moves to specific element
				   JavascriptExecutor js = (JavascriptExecutor)driver;
				   String script = "return document.getElementById(\"twotabsearchtextbox\").value;";
				   String text = (String)js.executeScript(script);
				   System.out.println(text);
				 
				   while(!text.equalsIgnoreCase("coats for Boys"))
				   {
					   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
					   text = (String)js.executeScript(script);
					   System.out.println(text);
					 
				   }

	}

}

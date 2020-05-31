package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDropDwnJavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\chromedriver.exe");
				  
				  WebDriver driver = new ChromeDriver();
				  
				  driver.get("https://www.amazon.com/");
				  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coats");
				  
				  
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
				   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
				   


	}

}

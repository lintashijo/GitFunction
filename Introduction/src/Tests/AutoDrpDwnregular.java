package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDrpDwnregular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("coats");
		String script = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println(script);
//				  
		
		  while(!script.equalsIgnoreCase("coats for Boys"))
		  {
		  
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		  script = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		  
		  
		  System.out.println(script);
		  
		  }
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

	}

}

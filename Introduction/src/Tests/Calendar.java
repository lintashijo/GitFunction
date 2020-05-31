package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com//");
		driver.findElement(By.className("ui-datepicker-trigger")).click();
	//	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/[class='ui-datepicker-month']")).click();
		
		
		  while
		  (!driver.findElement(By.cssSelector("[id='ui-datepicker-div'] [class='ui-datepicker-month']")).getText().contains(
		  "October")) {
		  
		  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click()
		  ; }
		  
		  List<WebElement> dates = driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
		  
		  int count = driver.findElements(By.cssSelector("td[data-handler='selectDay']")).size();
		  for(int i=0;i<count;i++) {
			  
			  String text= driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).getText();
			  if(text.equalsIgnoreCase("23")) {
				  
				  driver.findElements(By.cssSelector("td[data-handler='selectDay']")).get(i).click();
				  break;
			  }
		  }
		  
		 

	}

}

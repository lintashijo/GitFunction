import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver",
		  "C:\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.spicejet.com/");
		//  
		  driver.findElement(By.id("divpaxinfo")).click();
		  
		  Thread.sleep(2000L);
		      Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			  s.selectByValue("3");
			  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "3 Adult");

			  
			  
		//  int i=1;
		  
		 // while(i<5) {
			  
		
		
		 
		  
		  
		  }
		  
		  
		  
		  

	}



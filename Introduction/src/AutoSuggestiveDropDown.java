import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			 System.setProperty("webdriver.chrome.driver",
					  "C:\\chromedriver.exe");
					  
					  WebDriver driver = new ChromeDriver();
					  
					  driver.get("https://www.makemytrip.com/");
					  WebElement source = driver.findElement(By.id("fromCity"));
					  source.click();
					  driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("BOM");
					  Thread.sleep(2000);
				      driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
				      
				      System.out.println(driver.findElement(By.xpath("//input[@placeholder='From']")).getAttribute("value"));
				      
				      driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
				      
				  
					  
					  
				      
					  
					  

	}

}

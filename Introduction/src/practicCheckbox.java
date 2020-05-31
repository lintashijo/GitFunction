import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practicCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				  "C:\\chromedriver.exe");
				  
				  WebDriver driver = new ChromeDriver();
				  
				  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				  driver.findElement(By.id("checkBoxOption1")).click();
				  System.out.println(driver.findElement(By.id("checkBoxOption1")).isEnabled());
				  driver.findElement(By.id("checkBoxOption1")).click();
				  System.out.println(driver.findElement(By.id("checkBoxOption1")).isEnabled());
				  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				  
				  

	}

}

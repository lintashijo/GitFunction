import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http:\\facebook.com");
		 
		   System.out.println(driver.getTitle());
		  // driver.findElement(By.id("email")).sendKeys("This is my first code");
		 //  driver.findElement(By.name("pass")).sendKeys("123456");
		   
		   
		   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email");
		   driver.findElement(By.cssSelector("#pass")).sendKeys("email");
		   
		 //  driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		   driver.findElement(By.xpath("//input[@value='Log In']")).click();
		   System.out.println("hi there");
		   System.out.println("hi vada");
		   System.out.println("hi monkey");
		   System.out.println("hi linta");
		   System.out.println("hi livya");
		   System.out.println("hi clari");
		   System.out.println("hi christy");
		   
            System.out.println("add another branch");
            System.out.println("add another branch2");
            
		   

		   
	}
}
	


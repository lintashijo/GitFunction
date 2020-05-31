import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readingrocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver",
		  "C:\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.readingrockets.org/");
		  
	//	  driver.findElement(By.xpath("//*[text()='Teaching Reading']")).click();
		  driver.findElement(By.xpath("//li[@class='menu-5556']/following-sibling::li[2]")).click();

	}

}

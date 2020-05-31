package Tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com");
		
		                            //or use linktext=Multiple Windows
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click(); 
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>it =ids.iterator();
		String parentid = it.next();
		String childid =it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}

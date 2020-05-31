package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22883/nzxi-vs-ind-3-day-practice-match-india-tour-of-new-zealand-2020");
         WebElement table =	driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
         
         for(int i=0;i<count-2;i++) {
        	 
        	  String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
        	   int valueInteger=  Integer.parseInt(value);
        	   sum = sum+valueInteger; 
         }
         
         String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
         int extrasValue = Integer.parseInt(Extras);
         int totalsumValue = sum + extrasValue;
         System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        

		
		

	}

}

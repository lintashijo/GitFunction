package Tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement table  = driver.findElement(By.id("customers"));
		List<WebElement> firstColList= table.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList=new ArrayList<String>();

		for(int i=0;i<firstColList.size();i++)
		{
		
			originalList.add(firstColList.get(i).getText());
		}
		
		ArrayList<String> copiedList =new ArrayList<String>();

		for(int i=0;i<originalList.size();i++)

		{
		copiedList.add(originalList.get(i));

     	}
		
		Collections.sort(copiedList);
		
		
		for(String s1:originalList )

		{

		System.out.println(s1);
		}
		System.out.println("*******************");
		System.out.println("*******************");
		for(String s2:copiedList )

		{
		System.out.println(s2);
		}
	//	Assert.assertTrue(originalList.equals(copiedList));









	}

}

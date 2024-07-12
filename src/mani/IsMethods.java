package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//is display method
		/*
		 * driver.get("https://www.w3schools.com/"); WebElement search =
		 * driver.findElement(By.xpath("//input[@class='ga-fp']")); boolean display =
		 * search.isDisplayed(); System.out.println(display);
		 */
		//is selected method
		 driver.get("https://www.meesho.com/mobiles-and-accessories/pl/3tk?Category[0][id]=317&Category[0][label]=Mobile%20Accessories&Category[0][payload]=eyJmaWVsZCI6ImxhYmVscy4xIiwib3AiOiJpbiIsInZhbHVlIjoiMzE3In0%3D"); 
		 WebElement search= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[2]/div/div/div[1]/span[1]/svg")); 
		 boolean select=search.isSelected();
		 System.out.println(select);
		
		driver.quit();

	}

}

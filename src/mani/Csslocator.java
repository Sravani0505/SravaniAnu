package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		driver.manage().window().maximize();
		
		 w.get("https://www.facebook.com/");
		    w.findElement( By.id("email")).sendKeys("sravani123@gmail.com ");
		    w.findElement( By.id("pass")).sendKeys("sravs123");
		     w.findElement( By.id("text")).click();
		   // w.findElement(By.id("u_0_5_v")).submit();
		    Thread.sleep(3000);
		    w.quit();
		 

		
	
		
	}

}

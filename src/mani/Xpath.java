package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		//absolute Xpath
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		//xpath by attribute
		
		//driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
		//driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		//xpath by text function
		

		driver.findElement(By.xpath("//a[text()='CSS']")).click();
		driver.findElement(By.xpath("//a[text()='JAVASCRIPT']")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}

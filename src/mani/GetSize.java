package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		/*
		 * WebElement search =
		 * driver.findElement(By.xpath("//input[@id='tnb-google-search-input']"));
		 * Dimension size = search.getSize(); Point location = search.getLocation();
		 * System.out.println(size.height); System.out.println(size.width);
		 * System.out.println(location.x); System.out.println(location.y);
		 */
		//by using getrect method
		
		WebElement rect = driver.findElement(By.xpath("//*[@id=\"search2\"]"));
		 Rectangle sige = rect.getRect();
		 System.out.println(sige.height);
		 System.out.println(sige.width);
		 System.out.println(sige.x);
		 System.out.println(sige.y);
		driver.quit();


	}

}

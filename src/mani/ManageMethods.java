package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.luxe.ajio.com/c/special-offers-4931-53241?gclid=Cj0KCQiAyKurBhD5ARIsALamXaGxsGLK6C3lnrEVUyLeeRtoxydpUtL_n8pwz0MzEE8tzHAMqz57Z-YaAhPZEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		System.out.println("web page size is"+ driver.manage().window().getSize());
		//set webpage sige by using return type is dimension
		
		System.out.println("##########################");
		Dimension set=new Dimension(500,200);
		driver.manage().window().setSize(set);
		System.out.println("web page size is"+ driver.manage().window().getSize());
		//set position by using return type is point
		System.out.println("##########################");
		System.out.println("web page position is"+ driver.manage().window().getPosition());
		Thread.sleep(2000);
				Point p=new Point(30,40);
				driver.manage().window().setPosition(p);
				Thread.sleep(2000);
				System.out.println("web page position is"+ driver.manage().window().getPosition());
				
		driver.quit();

	}

}


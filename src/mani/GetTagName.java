package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetTagName {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		 WebElement search = driver.findElement(By.linkText(""));
		 		
		 	
		//System.out.println(search.getTagName());
		System.out.println(search.getAttribute("title"));
		driver.quit();

	}

}

package mani;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		//screenshot for web element
		/*
		 * WebElement password = driver.findElement(By.name("pass")); 
		 * File tempfile = (File) password.getScreenshotAs(OutputType.FILE); 
		 *  File permfile=new File("./screenshot/password.jpg/");
		 *   FileUtils.copyFile(tempfile, permfile);
		 */
		 
		 //screenshot for web page
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=(File) ts.getScreenshotAs(OutputType.FILE);
		 File des=new File("./screenshot/webpage.png/");
		 FileUtils.copyFile(src, des);
		 System.out.println("screen shot saved successfully");
		 driver.quit();
	}

}

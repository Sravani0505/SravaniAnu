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

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://github.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=(File)ts.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshot/image.png");
		FileUtils.copyFile(temp, perm);
		System.out.println("screenshot successfully saved");
		driver.quit();

	}

}

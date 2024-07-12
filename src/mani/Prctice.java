package mani;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prctice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id(""));
		driver.findElement(By.name("reg_email_confirmation__"));
		
	}

}

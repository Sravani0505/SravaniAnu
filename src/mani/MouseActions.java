package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		Actions actions=new Actions(driver);
		actions
		.moveToElement(driver.findElement(By.linkText("Resources")))
		.moveToElement(driver.findElement(By.linkText("eBooks")))
		.click()
		.perform();
		driver.quit();
	}
}





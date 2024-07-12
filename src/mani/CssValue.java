package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		 WebElement css = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[2]"));
		 System.out.println(css.getCssValue("font-size"));//16-px
		 System.out.println(css.getCssValue("background-color"));//
		 System.out.println(css.getCssValue("vertical-align"));//middile
		 System.out.println(css.getCssValue("position"));//relative
		 driver.quit();
	}

}

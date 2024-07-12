package mani;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.zomato.com/hyderabad/restaurants?utm_source=google&utm_medium=cpc&utm_campaign=Gsearch_P-MWeb_O-NA_C-Brand_A-AllUser_SC-Generic_L-SouthIndia-20231122&utm_term=zomato&gad_source=1&gclid=CjwKCAiAjrarBhAWEiwA2qWdCJQbdei4ef2ftnhBiieHf6aKf4IoiN690Hj_ZOWqOLxKl5gDb1JbDhoC42sQAvD_BwE");
		//js.executeScript("document.evaluate(\"(//h4[text()='Peshawar'])\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue\r\n", args);
		//WebElement food = driver.findElement(By.linkText("Cafe Bahar"));
		//js.executeScript("argument[0]",food);
		js.executeScript("window.scrollTo(0,3000)", args);
		driver.findElement(By.linkText("Chotu's The Food People")).click();
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,2000)", args);
		//Thread.sleep(3000);
		
		driver.quit();

	}

}

package mani;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeAllInOne {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Selectable")).click();
		Thread.sleep(2000);
		//driver.switchTo().frame(0);//with using [int index],using[id or name]
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));//by using xpath or expression
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Button")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@text()='A button element']")).click();
	//driver.findElement(By.linkText("Button")).click();
		driver.quit();
		

	}

}

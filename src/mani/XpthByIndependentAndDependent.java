package mani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpthByIndependentAndDependent {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/Samsung-Storage-MediaTek-Octa-core-Processor/dp/B0BMGB2TPR/ref=sr_1_3?keywords=mobiles&qid=1701490788&sr=8-3&th=1");
	WebElement text = driver.findElement(By.xpath("//span[text()='        Samsung Galaxy M04 Light Green, 4GB RAM, 64GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 Octa-core Processor | 5000 mAh Battery | 13MP Dual Camera       ']/../../../..//span[@class='a-price-whole']"));
	System.out.println(text.getText());
	driver.quit();
	}
}

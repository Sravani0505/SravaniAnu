package mani;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOuts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		//default time out is 300 seconds that is 5min
		//give time is 1 sec then you will get time out exception
		//give the -ve value then you will get invalid argument exception
		//sets the amount of time to wait fora pageload tocomplete before throwing an error
		Instant starttime=Instant.now();
		System.out.println(starttime.toString());
		driver.get("https://www.facebook.com/");
		Instant endtime=Instant.now();
		System.out.println(endtime.toString());
		Duration time=Duration.between(starttime, endtime);
			
		System.out.println("page load time out"+time.toMillis());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}

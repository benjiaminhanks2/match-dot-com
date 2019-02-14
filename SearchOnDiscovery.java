package MatchDotComTests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;

public class SearchOnDiscovery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sqlme\\Desktop\\workspace\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.match.com/login?to=/home&alf=1");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("javeduhmj@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Naira0524");
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section/form/div/div/div/div[5]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/header/nav/div/div[2]/div[2]/button/div[1]/div[2]")).click();
			driver.findElement(By.className("css-t37t6d eqr2yuu2")).click();
			
			 WebDriver augmentedDriver = new Augmenter().augment(driver);
		       File screenshot = ((TakesScreenshot)augmentedDriver).
		               getScreenshotAs(OutputType.FILE);
		   }	
	

}

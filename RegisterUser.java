package MatchDotComTests;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.InitializeBase;

public class RegisterUser extends InitializeBase {
	
	
	public WebDriver driver;
   
      
   	
	@BeforeTest
	
	public void Initialize() throws IOException{
		// TODO Auto-generated method stub
		
		driver =initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		/*
		 * System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		 * driver=new ChromeDriver();
		 * 
		 * driver.get("https://www.match.com/"); // Hit url on the browser
		 * driver.manage().window().maximize(); // Maximize the screen
		 * System.out.println(driver.getTitle()); //validate if your Page title is
		 * correct
		 * 
		 * System.out.println(driver.getCurrentUrl()); //validate if you are landed on
		 * correct url
		 */		
	}
		
	@Test
	public void LandingPage() {	
	
	Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"form\"]/fieldset/div[1]/select[1]")));

	sel1.selectByValue("2");

	Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"form\"]/fieldset/div[1]/select[2]")));

	sel2.selectByValue("1");

	Select sel3 = new Select(driver.findElement(By.name("lage")));

	sel3.selectByVisibleText("30");

	Select sel4 = new Select(driver.findElement(By.name("uage")));

	sel4.selectByVisibleText("35");

	driver.findElement(By.name("postalCode")).sendKeys("75025");

	driver.findElement(By.xpath("//*[@id=\"form\"]/fieldset/div[4]/button")).click();
	

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
	
	@Test
	
	public void LoginPage()
	{
	
	
		
	driver.findElement(By.xpath("//*[@id=\"emailField\"]")).sendKeys("javedfire786@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\"passwordField\"]")).sendKeys("password");
	
	Select sel5 = new Select(driver.findElement(By.name("birthMonth")));

	sel5.selectByIndex(1);

	Select sel6 = new Select(driver.findElement(By.name("birthDay")));

	sel6.selectByVisibleText("29");

	Select sel7 = new Select(driver.findElement(By.name("birthYear")));

	sel7.selectByVisibleText("1992");

	driver.findElement(By.xpath("//*[@id=\"formRegistration\"]/div[2]/div[6]/button")).click();
	
	driver.findElement(By.id("handleField")).sendKeys("Jay");
	
	driver.findElement(By.linkText("<use xlink:href=\"/bundles/49/svg/theme-icons-0e3a0c0ea9f63a622016c0d7ce3c8411.svg#match-check\"></use>"));
	
	
	
driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/button[2]/span")).click();
	
	
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/ul/li[3]/div")).click();
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_intent-target\"]/button")).click();
	
	driver.findElement(By.id("profile-capture-question-cta-self_height")).click(); //Height
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_height-target\"]/button")).click();// Height
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[2]/button")).click();// Body Type
	 
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click();// Relationship Status
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click(); // Have kids
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[3]/button")).click(); // Want kids
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[4]/button")).click(); // Education
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/div[1]/button")).click(); //Smoking
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div[1]/div[1]/div/label[4]/span[2]/span/strong")).click(); //Ethnicity
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_ethnicities-target\"]/button")).click(); //save and continue
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div[2]/div[1]/button")).click(); //Religion
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div[1]/div[4]/button")).click(); //Salary
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/div/div/a")).click(); //skip
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div[1]/div[1]/button/div")).click();
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-omni_seek-target\"]/button")).click();
	
	driver.findElement(By.name("body")).sendKeys("I have a great sense of humor and laugh at myself all the time. I’d like to meet someone who is adventurous and likes having fun");
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-question-cta-self_essay-target\"]/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section[1]/div/div/a")).click(); //Skip
	
	driver.findElement(By.xpath("//*[@id=\"profile-capture-wrap\"]/div[2]/div/div/div/a/span")).click(); // Profile created
	
	
	
	}
			
}
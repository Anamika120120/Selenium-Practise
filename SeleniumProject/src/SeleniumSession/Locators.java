package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("annu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("annu@qa.com");
	    driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
	    driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("annu@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
	    //Using .classname
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    
	    //Parent to child
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.xpath("//div[contains(@class, 'forgot-pwd-btn-conainer')]/button[1]")).click();
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("annu");
	    //using regular expression css
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("chkboxTwo")).click();
	    driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	    
	}
}

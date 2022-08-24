package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		String name = "Annu";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//form/input[@id='inputUsername']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[contains(@class , 'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		/*String s = driver.findElement(By.cssSelector("div[class = 'login-container'] h2")).getText();
		String t = "Hello "+ name+","; */
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class = 'login-container'] h2")).getText(), "Hello "+ name+"," );
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String passwordarray[] = passwordText.split("'");
		String password = passwordarray[1].split("'")[0];
		return password;
		
	}
}

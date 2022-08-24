package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();	
		//Using parent to child xpath
		Driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
	}

}

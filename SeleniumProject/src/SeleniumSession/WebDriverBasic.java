package SeleniumSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic { 

	public static void main(String[] args) {
		
		
		//Firefox driver
		
		//System.setProperty("webdriver.gecko.driver", "D:\\java folder\\geckodriver.exe"); 
         //WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com/");
		//System.out.println(driver.getTitle());
		
		//Chrome driver
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com/");
		//system.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		//edge driver
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Downloads\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		
}
}
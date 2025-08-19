package Pack1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc013 {
	@Parameters("browser")
  @Test
  public void test(String browser) {
		  WebDriver driver = null;

	        if (browser.equalsIgnoreCase("chrome")) {
	            System.out.println("This is Chrome test");
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } 
	        else if (browser.equalsIgnoreCase("firefox")) {
	            System.out.println("This is Firefox test");
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } 
	        else if (browser.equalsIgnoreCase("edge")) {
	            System.out.println("This is Edge test");
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        }

	        driver.get("https://www.flipkart.com/");
	    }
	}
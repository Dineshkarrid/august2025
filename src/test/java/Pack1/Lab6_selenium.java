package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6_selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.linkText("Components")).click();
	    driver.findElement(By.linkText("Monitors (2)")).click();
	    WebElement show=driver.findElement(By.id("input-limit"));
      Select sle = new Select(show);
      sle.selectByIndex(1);
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
	  Thread.sleep(3000); 
     driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")).click();
		

	}

}

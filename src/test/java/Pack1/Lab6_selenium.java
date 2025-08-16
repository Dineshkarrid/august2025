package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6_selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
     WebElement specTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-bordered']")));
     System.out.println("Specification present: " + specTable.isDisplayed());
     driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
     WebElement wishlistMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-success")));
     System.out.println("Wish list message: " + wishlistMsg.getText());
     driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mobile");
     driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
     driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
     driver.findElement(By.id("button-search")).click();
     driver.findElement(By.linkText("HTC Touch HD")).click();
     WebElement quant=driver.findElement(By.id("input-quantity"));
     quant.clear();
     quant.sendKeys("3");
     driver.findElement(By.id("button-cart")).click();


	}

}

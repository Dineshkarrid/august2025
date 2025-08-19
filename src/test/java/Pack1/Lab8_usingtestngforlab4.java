package Pack1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab8_usingtestngforlab4 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  driver.findElement(By.linkText("Desktops")).click();
	  driver.findElement(By.linkText("Mac (1)")).click();
	  WebElement sort=driver.findElement(By.id("input-sort"));
		Select sle=new Select(sort);
		sle.selectByIndex(1);
		driver.findElement(By.xpath("//button/span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']//i[@class='fa fa-search']")).click();
		Thread.sleep(3000);
		WebElement cl=driver.findElement(By.id("input-search"));
		cl.clear();
		driver.findElement(By.id("description")).click();
  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" }
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}

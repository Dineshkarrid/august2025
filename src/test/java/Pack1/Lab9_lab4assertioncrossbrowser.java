package Pack1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab9_lab4assertioncrossbrowser {
    WebDriver driver;

    @Parameters("browser")
    @Test
    public void runTest(String browser) throws InterruptedException {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/index.php?");
        Assert.assertEquals(driver.getTitle(), "Your Store", browser + " : Title mismatch!");

        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Mac (1)")).click();
        WebElement sort = driver.findElement(By.id("input-sort"));
        Select sle = new Select(sort);
        sle.selectByIndex(1);
        Assert.assertEquals(sle.getFirstSelectedOption().getText(), "Name (A - Z)", browser + " : Wrong sort applied!");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        WebElement addToCart = driver.findElement(By.xpath("//button/span[text()='Add to Cart']"));
        Assert.assertTrue(addToCart.isDisplayed(), browser + " : Add to Cart not visible!");
        addToCart.click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mobile");
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']//i[@class='fa fa-search']")).click();
        Thread.sleep(2000);

        WebElement cl = driver.findElement(By.id("input-search"));
        Assert.assertTrue(cl.isDisplayed(), browser + " : Search input not displayed!");
        cl.clear();

        WebElement Checkbox = driver.findElement(By.id("description"));
        Checkbox.click();
        Assert.assertTrue(Checkbox.isSelected(), browser + " : Description checkbox not selected!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_seleniumwebdriver_createaccount {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?");

		
		String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        if (actualTitle.equals("Your Store")) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
        
        WebElement myAccount = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
        myAccount.click();
        
       
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
        WebElement registerHeading = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1"));
        if(registerHeading.isDisplayed()) {
        	System.out.println("Register heading is displayed " + registerHeading.getText());
        		
        	}else {
        		System.out.println("Register heading is not found");
        }
        
        WebElement next= driver.findElement(By.xpath("//input[@type='submit']"));
        next.click();
        
        
        WebElement warningMsg = driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
        String warningMsgText = warningMsg.getText();
        if(warningMsgText.contains("Warning: You must agree to the Privacy Policy!")) {
        	System.out.println(" msg verified");
        }else {
        	System.out.println(" not verified");
        	


}
}}
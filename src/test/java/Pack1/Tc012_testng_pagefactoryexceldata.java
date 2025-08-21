package Pack1;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Tc012_testng_pagefactoryexceldata {

    WebDriver driver;

    // Test Method with DataProvider
    @Test(dataProvider = "dp")
    public void f(String username, String password) throws Exception {
        String title = driver.getTitle();
        System.out.println("The Title is: " + title);

        Thread.sleep(2000);

        // PageFactory initialization
        login_pagefactory obj = PageFactory.initElements(driver, login_pagefactory.class);

        // Perform login actions
        obj.enterusername(username);
        obj.enterpassword(password);
        obj.clickonlogin();
    }

    // Before each test
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    // After each test
    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
        driver.quit();
    }

    // DataProvider to fetch data from Excel
    @DataProvider
    public Object[][] dp() throws IOException {
        String projectpath = System.getProperty("user.dir");
        File file1 = new File(projectpath + "\\data.xlsx");   // Excel file should be inside project folder
        FileInputStream fs = new FileInputStream(file1);

        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet worksheet = workbook.getSheetAt(0);

        int rowcount = worksheet.getPhysicalNumberOfRows();
        int colcount = worksheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rowcount][colcount];

        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < colcount; j++) {
                data[i][j] = worksheet.getRow(i).getCell(j).getStringCellValue();
            }
        }

        workbook.close();
        fs.close();

        return data;
    }
}
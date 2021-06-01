import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    NewAccountModalPage newAccountModalPage;

    @BeforeMethod
    public void initTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        initPages();
    }

    @AfterMethod
    public void endTest() {
        driver.quit();
    }

    public void initPages() {
        newAccountModalPage = new NewAccountModalPage(driver);
    }
}


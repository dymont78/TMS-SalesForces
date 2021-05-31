import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class AccountTest extends BaseTest{

    private static final String URL = "https://oaojzs.my.salesforce.com";
    private static final String LOGIN = "td78-v1y6@force.com";
    private static final String PASSWORD = "&YP39TJUrqxy!Mp*";

    @Test
    public void createAccountTest() {
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
        newAccountModalPage.openPage();
        newAccountModalPage.create("FirstAccount", "www.tut.by", "Customer",
                                    "Engineering" ,"1-234-56789", "25", "1000",
                                    "No description", "Ozornaya", "Zhabinka", "Brest",
                                    "123456", "BY");
    }

}

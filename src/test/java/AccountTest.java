import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class AccountTest extends BaseTest{

    private static final String URL = "https://oaojzs.my.salesforce.com";
    private static final String LOGIN = "td78-v1y6@force.com";
    private static final String PASSWORD = "&YP39TJUrqxy!Mp*";
    private static final String ASSERT_XPATH = "//span[text() = '%s']/ancestor::div[contains(@class, 'slds-form-element')]//*[contains(@slot, 'outputField')]";

    @Test
    public void createAccountTest() {
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
        newAccountModalPage.openPage();
        String accountName = newAccountModalPage.randomString(8);
        newAccountModalPage.create(accountName, "www.tut.by", "Customer",
                                    "Engineering" ,"1-234-56789", "25", "10000", "Not description",
                                    "Ozornaya", "Zhabinka", "Brest", "123456", "BY");
        Assert.assertEquals(driver.findElement(By.xpath(String.format(ASSERT_XPATH, "Account Name"))).getText(), accountName);
        Assert.assertEquals(driver.findElement(By.xpath(String.format(ASSERT_XPATH, "Website"))).getText(), "www.tut.by");
    }

}

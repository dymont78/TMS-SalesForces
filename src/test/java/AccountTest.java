import objects.Account;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Utils;
import static pages.BasePage.*;

public class AccountTest extends BaseTest{

    @Test
    public void createAccountTest() {
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
        newAccountModalPage.openPage();
        String accountName = Utils.randomString(8);
        Account account = new Account(accountName, "www.tut.by", "Customer", "Engineering",
                "1-234-56789", "25", "10000", "Not description", "Ozornaya",
                "Zhabinka", "Brest", "123456", "BY" );
        newAccountModalPage.create(account);
        Assert.assertEquals(newAccountModalPage.findByXpath("Account Name").getText(),accountName);
        Assert.assertEquals(newAccountModalPage.findByXpath("Website").getText(),"www.tut.by");
        Assert.assertEquals(newAccountModalPage.findByXpath("Phone").getText(),"1-234-56789");
        Assert.assertEquals(newAccountModalPage.findByXpath("Employees").getText(),"25");
        Assert.assertEquals(newAccountModalPage.findByXpath("Annual Revenue").getText(),"$10,000");
    }
}

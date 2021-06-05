package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public static final String BASE_URL = "https://oaojzs.lightning.force.com";
    public static final String URL = "https://oaojzs.my.salesforce.com";
    public static final String LOGIN = "td78-v1y6@force.com";
    public static final String PASSWORD = "&YP39TJUrqxy!Mp*";
    public static final String ASSERT_XPATH = "//span[text() = '%s']/ancestor::div[contains(@class, 'slds-form-element')]//*[contains(@slot, 'outputField')]";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findByXpath(String textLabel) {
        return driver.findElement(By.xpath(String.format(ASSERT_XPATH, textLabel)));
    }
}

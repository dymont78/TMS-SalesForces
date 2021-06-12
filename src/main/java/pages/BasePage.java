package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public static final String BASE_URL = "https://oaojzs.lightning.force.com";
    public static final String URL = "https://oaojzs.my.salesforce.com";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}

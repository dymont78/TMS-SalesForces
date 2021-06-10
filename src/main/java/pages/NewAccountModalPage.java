package pages;

import elements.Button;
import elements.DropDown;
import elements.Input;
import elements.TextArea;
import objects.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountModalPage extends BasePage{
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    private static final String DUPLICATION_ALERT = "//div[contains(text(),'like a duplicate')]";
    public static final String ASSERT_XPATH = "//span[text() = '%s']/ancestor::div[contains(@class, 'slds-form-element')]//*[contains(@slot, 'outputField')]";

    public NewAccountModalPage openPage() {
        driver.get(BASE_URL + "/lightning/o/Account/new");
        return this;
    }

    public void create(Account account){
        new Input(driver, "Account Name").writeText(account.getAccountName());
        new Input(driver, "Phone").writeText(account.getPhone());
        new Input(driver, "Fax").writeText(account.getPhone());
        new Input(driver, "Website").writeText(account.getWebsite());
        new DropDown(driver, "Type").select(account.getOptionType());
        new DropDown(driver, "Industry").select(account.getOptionIndustry());
        new Input(driver, "Employees").writeText(account.getEmployees());
        new Input(driver, "Annual Revenue").writeText(account.getAnnualRevenue());
        new TextArea(driver, "Description").writeText(account.getDescription());
        new TextArea(driver, "Billing Street").writeText(account.getBillingStreet());
        new Input(driver, "Billing City").writeText(account.getBillingCity());
        new Input(driver, "Billing State/Province").writeText(account.getBillingStateProvince());
        new Input(driver, "Billing Zip/Postal Code").writeText(account.getBillingZipPostalCode());
        new Input(driver, "Billing Country").writeText(account.getBillingCountry());
        new Button(driver, "Save").clickButton();
        if (driver.findElement(By.xpath(DUPLICATION_ALERT)).isEnabled()) {
            new Button(driver, "Save").clickButton();
        }
    }
    public WebElement findByXpath(String textLabel) {
        return driver.findElement(By.xpath(String.format(ASSERT_XPATH, textLabel)));
    }
    public NewAccountModalPage getAndLoginSite(String login, String password) {
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("Login")).click();
        return this;
    }
}
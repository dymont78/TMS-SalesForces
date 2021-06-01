package pages;

import elements.Button;
import elements.DropDown;
import elements.Input;
import elements.TextArea;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.SecureRandom;

public class NewAccountModalPage extends BasePage{
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }
    private static final  String URL = "https://oaojzs.lightning.force.com/lightning/o/Account/new";
    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String DUPLICATION_ALERT = "//div[contains(text(),'like a duplicate')]";

    private static SecureRandom rnd = new SecureRandom();

    public void openPage() {
        driver.get(URL);
    }

    public void create(String accountName, String website, String optionType, String optionIndustry,
                       String phone, String employees, String annualRevenue, String description,
                       String billingStreet, String billingCity, String billingStateProvince,
                       String billingZipPostalCode, String billingCountry) {
        new Input(driver, "Account Name").writeText(accountName);
        new Input(driver, "Phone").writeText(phone);
        new Input(driver, "Fax").writeText(phone);
        new Input(driver, "Website").writeText(website);
        new DropDown(driver, "Type").select(optionType);
        new DropDown(driver, "Industry").select(optionIndustry);
        new Input(driver, "Employees").writeText(employees);
        new Input(driver, "Annual Revenue").writeText(annualRevenue);
        new TextArea(driver, "Description").writeText(description);
        new TextArea(driver, "Billing Street").writeText(billingStreet);
        new Input(driver, "Billing City").writeText(billingCity);
        new Input(driver, "Billing State/Province").writeText(billingStateProvince);
        new Input(driver, "Billing Zip/Postal Code").writeText(billingZipPostalCode);
        new Input(driver, "Billing Country").writeText(billingCountry);
        new Button(driver, "Save").clickButton();
        if (driver.findElement(By.xpath(DUPLICATION_ALERT)).isEnabled()) {
            new Button(driver, "Save").clickButton();
        }

    }

    public String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

}

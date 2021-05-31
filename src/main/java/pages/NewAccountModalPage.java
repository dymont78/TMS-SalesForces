package pages;

import elements.Button;
import elements.DropDown;
import elements.Input;
import elements.TextArea;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage{
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }
    private static final  String URL = "https://oaojzs.lightning.force.com/lightning/o/Account/new";

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

    }

}

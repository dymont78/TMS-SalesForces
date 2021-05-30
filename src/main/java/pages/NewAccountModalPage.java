package pages;

import elements.Button;
import elements.DropDown;
import elements.Input;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BasePage{
    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }
    private static final  String URL = "https://oaojzs.lightning.force.com/lightning/o/Account/new";

    public void openPage() {
        driver.get(URL);
    }

    public void create(String accountName, String website, String optionType, String optionIndustry, String phone) {
        new Input(driver, "Account Name").writeText(accountName);
        new Input(driver, "Phone").writeText(phone);
        new Input(driver, "Fax").writeText(phone);
        new Input(driver, "Website").writeText(website);
        new DropDown(driver, "Type").select(optionType);
        new DropDown(driver, "Industry").select(optionIndustry);
        new Button(driver, "Cancel").clickButton();
    }

}

package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
    WebDriver driver;
    String label;

    private static final String BUTTON_XPATH = "//button[@title='%s']";

    public Button(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void clickButton(){
        driver.findElement(By.xpath(String.format(BUTTON_XPATH, label))).click();
    }
}

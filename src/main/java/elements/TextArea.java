package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    WebDriver driver;
    String label;

    private static final String TEXT_XPATH ="//span[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeText(String text) {
        driver.findElement(By.xpath(String.format(TEXT_XPATH, label))).sendKeys(text);
    }
}

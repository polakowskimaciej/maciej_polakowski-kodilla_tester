package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RandomPage extends AbstractPage {
    public RandomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    public String getUrl() {
        return driver.getCurrentUrl();
    }
    //potrzebuję tą listę z Google results
}

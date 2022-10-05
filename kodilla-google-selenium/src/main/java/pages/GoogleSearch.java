package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearch extends AbstractPage {
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
    static WebElement inputField;

    @FindBy(css = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")
    static List<WebElement> searchButton;

    public void searchResults() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        Thread.sleep(5000);
        inputField.sendKeys("Kodilla");
        inputField.submit();
        GoogleResults googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }

    public void searchResultsWithRandomPage() throws InterruptedException {
        PageFactory.initElements(driver, GoogleSearch.class);
        Thread.sleep(5000);
        inputField.sendKeys("Kodilla");
        inputField.submit();
        GoogleResults googleResults = loadResults(driver);
        googleResults.addRandomPageNumber();
        System.out.println(googleResults.getRandomPageUrl());
        googleResults.selectRandomPage();
    }

    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }

    public GoogleResults loadResults(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(5000);
        //searchButton.get(1).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }

    //public RandomPage(WebDriver driver) throws InterruptedException {
    //  Thread.sleep(5000);

    //}
}
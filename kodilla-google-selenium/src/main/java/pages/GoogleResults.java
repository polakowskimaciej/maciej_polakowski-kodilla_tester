package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {
    @FindBy(css = "#rso")                  // [1]
    private List<WebElement> results;                // [2]
    private static List<Integer> saidRandomNumber;
    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }
    public RandomPage selectRandomPage() {
        results.get(getSaidRandomNumber()).click();
        RandomPage randomPage = new RandomPage(driver);
        return randomPage;
    }
    public String getRandomPageUrl() {
        return results.get(getSaidRandomNumber()).getAttribute("href");
    }
    public void addRandomPageNumber() {
        Random random = new Random();
        int max = this.results.size();
        int saidNumber = random.nextInt(max);
        saidRandomNumber.add(saidNumber);
    }

    public static Integer getSaidRandomNumber() {
        return saidRandomNumber.stream().mapToInt(Integer::intValue).sum();
    }
}

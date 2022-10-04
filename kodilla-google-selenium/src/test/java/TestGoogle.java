import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearch;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGoogle {

    WebDriver driver;


    @BeforeEach
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\InteliJ_Projects\\kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.id("L2AGLb")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector("input[title='Szukaj']")));
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
    @Test
    public void testRandomPage() throws InterruptedException {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        googleSearch.searchResultsWithRandomPage();
        String url = driver.getCurrentUrl();
        assertEquals(url,outputStreamCaptor.toString().trim());
    }
}
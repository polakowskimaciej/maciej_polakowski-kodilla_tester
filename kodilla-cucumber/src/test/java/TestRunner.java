import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\InteliJ_Projects\\kodilla-course\\kodilla-cucumber\\src\\test\\resources\\is_it_summer.feature"}
)
public class TestRunner {
}
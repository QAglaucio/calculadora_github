package learn;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        snippets = CAMELCASE,
        dryRun = false,
        publish = true
)
public class CucumberTest {
    @After
    public void cleanUp(){
        System.out.println("Esta limpo.");
    }
    @Before
    public void setUp(){
        System.out.println("Configurado.");
    }
}

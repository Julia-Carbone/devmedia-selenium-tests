package steps;

import io.cucumber.java.es.Dado;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsTwitch {
    private static WebDriver driver;

    @Dado("que o usuário esteja no sistema Twitch")
    public void acessSystem() {

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome,driver", "C:\\Users\\julia\\Documents\\QA\\automationTest\\chromedriver.exe");
        driver.get("https://www.twitch.tv/\n");

    }
}

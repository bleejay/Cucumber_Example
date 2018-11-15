package SeleniumConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriverConfig {

    private WebDriver driver;

    public SeleniumDriverConfig(String browser) {

        SeleniumProperties seleniumProperties = new SeleniumProperties(browser);

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getDriverPath());
            this.driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", seleniumProperties.getDriverPath());
            this.driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", seleniumProperties.getDriverPath());
            this.driver = new EdgeDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}

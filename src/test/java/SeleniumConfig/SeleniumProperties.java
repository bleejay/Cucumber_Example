package SeleniumConfig;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumProperties {

    private String driverPath;
    private Long implicitWaitTime;

    public SeleniumProperties(String browser) {
        Properties seleniumProperties = new Properties();
        try {
            seleniumProperties.load(new FileReader("C:\\Users\\TECH-W87\\Engineering_19\\Java\\Cucumber_Example\\src\\test\\java\\SeleniumConfig\\selenium.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        implicitWaitTime = Long.parseLong(seleniumProperties.getProperty("implicitWaitTime"));

        if (browser.equalsIgnoreCase("chrome")) {
            driverPath = seleniumProperties.getProperty("chromeDriverPath");
        }else if (browser.equalsIgnoreCase("firefox")){
            driverPath = seleniumProperties.getProperty("firefoxDriverPath");
        }else if (browser.equalsIgnoreCase("edge")){
            driverPath = seleniumProperties.getProperty("edgeDriverPath");
        }
    }

    public String getDriverPath() {
        return driverPath;
    }

    public Long getImplicitWaitTime() {
        return implicitWaitTime;
    }
}

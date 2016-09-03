package applogic1;

import applogic.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by timrusso on 4/28/16.
 */
public class ApplicationManager1 implements ApplicationManager {

    private LoginHelper loginHelper;


    private IOSDriver driver;
    private AppiumDriver appiumDriver;
    private AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    public ApplicationManager1() throws Exception {

        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("automationName", "Appium");

        capabilities.setCapability("platformVersion", "8.2");
        capabilities.setCapability("deviceName", "iPhone Simulator");
        capabilities.setCapability("noReset", true); //чтобы не было перезагрузки симулятора после тестов
        capabilities.setCapability("fullReset", true); //чтобы вырубался симулятор после тестов

        File file = new File("/Users/timrusso/TIM/EngageAdvisor.app");
        capabilities.setCapability("app", file.getAbsolutePath());

        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginHelper = new LoginHelper1(this);


    }



    public LoginHelper getLoginHelper() {
        return  loginHelper;
    }


    public void stop() {
        if(driver != null) {
            //driver.closeApp();
            //appiumDriver.removeApp("com.titanium.engageAdvisor");
            driver.quit();
        }

        service.stop();
    }

    public IOSDriver getIOSDriver() {
        return driver;
    }


}

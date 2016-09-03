package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by timrusso on 4/28/16.
 */
public abstract class Page {

    protected IOSDriver driver;
    protected PageManager pages;
    protected WebDriverWait wait;

    public Page(PageManager pages) {
        this.pages = pages;
        driver = pages.getIOSDriver();
        wait = new WebDriverWait(driver, 30);
    }

    public Page ensurePageLoaded() {
        return this;
    }

    public boolean waitPageLoaded() {
        try {
            ensurePageLoaded();
            return true;
        } catch (TimeoutException to) {
            return  false;
        }
    }

    public IOSDriver getIOSDriver() {
        return driver;
    }

}

package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by timrusso on 4/28/16.
 */
public class PageManager {

    private IOSDriver driver;


    public LoginPage loginPage;
    public InternalPage internalPage;


    public PageManager(IOSDriver driver) {
        this.driver = driver;
        loginPage = initElements(new LoginPage(this));
        internalPage = initElements(new InternalPage(this));



    }

    private < T extends Page>  T initElements(T page) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), page);
        return page;
    }

    public IOSDriver getIOSDriver() {
        return driver;
    }

}

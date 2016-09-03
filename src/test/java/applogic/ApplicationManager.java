package applogic;

import io.appium.java_client.ios.IOSDriver;

/**
 * Created by timrusso on 4/28/16.
 */
public interface ApplicationManager {


    LoginHelper getLoginHelper();

    void stop();
    IOSDriver getIOSDriver();

}

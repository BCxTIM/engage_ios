package tests;

import org.testng.annotations.Test;
import pages.TestBase;

import static org.testng.AssertJUnit.assertTrue;


/**
 * Created by timrusso on 4/25/16.
 */
public class LoginFlowTests extends TestBase {


    @Test //временно отключил т/к/ нет необходимости проверять тут
    public void loginOk() throws Exception {
        app.getLoginHelper().loginAs(ADVISER);
    }


}

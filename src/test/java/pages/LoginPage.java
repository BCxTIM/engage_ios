package pages;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;


/**
 * Created by timrusso on 4/26/16.
 */
public class LoginPage extends AnyPage {

   public LoginPage(PageManager pages) {
       super(pages);
   }



    @iOSFindBy(accessibility = "flagButton")
    public IOSElement flagDropDownList;

    @iOSFindBy(accessibility = "countryField")
    public IOSElement searchCountryField;

    @iOSFindBy(accessibility = "(+373) Moldova")
    public IOSElement countrySelected;

    @iOSFindBy(accessibility = "phoneField")
    public IOSElement phoneField;

    @iOSFindBy(accessibility = "getCodeButton")
    public  IOSElement getCodeButton;

    @iOSFindBy(accessibility = "logoButton")
    public IOSElement logo;



    public LoginPage setCountry(String countryCode) {
        flagDropDownList.click();
        searchCountryField.sendKeys(countryCode);
        countrySelected.click();
        return this;
    }

    public LoginPage setPhone(String phone) {
        phoneField.sendKeys(phone);
        logo.click();
        return this;
    }

    public void getCode() {
        getCodeButton.click();
    }


}

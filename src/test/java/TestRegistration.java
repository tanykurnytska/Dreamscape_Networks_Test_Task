import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import steps.BaseTest;

import static org.testng.Assert.assertTrue;

public class TestRegistration extends BaseTest {


    @Test
    public void registrationCorrect() {

        var firstNameRegistr = "Ivan";
        var lastNameRegistr = "Ivanov";
        var addressRegistr = "Street 57";
        var cityRegistr = "Kiev";
        var postcodeZipRegistr = "04116";
        var countryRegistr = "Ukraine";
        var stateRegistr = "Kievskaya";
        var phoneRegistr = "+380977778777";
        var emailRegistr = "IvanovIvan9989@gmail.com";
        var usernameRegistr = "IvanIvanov99";
        var passwordRegistr = "12tyu5jkk677u";


        registr.insertFirstName(firstNameRegistr);
        registr.insertLastName(lastNameRegistr);
        registr.insertAdress(addressRegistr);
        registr.insertCity(cityRegistr);
        registr.insertPostcodeZip(postcodeZipRegistr);
        registr.clickOnCountry(countryRegistr);
        registr.clickOnSelectCountry();
        registr.clickOnState(stateRegistr);
        registr.insertPhone(phoneRegistr);
        registr.insertEmail(emailRegistr);
        registr.clickOnContactPermission();
        registr.insertUsername(usernameRegistr);
        registr.insertPassword(passwordRegistr);
        registr.clickOnContinueOrder();
        registr.clickOnMyAccaunt();
        registr.clickOnLogIn();
        var userRegistrEmail = registr.getRegistrEmail();

        assertTrue(userRegistrEmail.contains(emailRegistr), "An user is unauthorized");

    }



}

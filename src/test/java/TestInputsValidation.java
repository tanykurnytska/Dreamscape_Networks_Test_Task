import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import steps.page.RegistrationPage;
import steps.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertTrue;

public class TestInputsValidation extends BaseTest {

    private static String ERROR_TEMPLATE = "//*[text()='%s']";
    RegistrationPage locator = new RegistrationPage();


    @Test(dataProvider = "invalidInputsFirstName")
    public void tetsFirstNameField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.firstName, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.firstName);
    }

    @Test(dataProvider = "invalidInputLastName")
    public void tetsLastNameField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.lastName, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.lastName);
    }


    @Test(dataProvider = "invalidInputsAdress")
    public void tetsAdressField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.address, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.address);
    }

    @Test(dataProvider = "invalidInputsCity")
    public void tetsCityField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.city, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.city);
    }

    @Test(dataProvider = "invalidInputsPostcodeZip")
    public void tetsPostcodeZipField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.postcodeZip, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.postcodeZip);
    }

    @Test
    public void invalidInputsState() {
        var exeptedErrorMesage = "Enter you state";
        var input = "1";
        var countryRegistr = "Ukraine";
        registr.clickOnCountry(countryRegistr);
        registr.clickOnSelectCountry();
        valid.errorValidationSendKewys(locator.state, input);
        valid.clearInput(locator.state);
        driver.findElement(locator.phone).click();
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.country);
        valid.clearInput(locator.state);
    }

    @Test(dataProvider = "invalidInputsPhone")
    public void tetsPhoneField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.phone, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.phone);
    }

    @Test(dataProvider = "invalidInputsEmail")
    public void tetsEmailField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.email, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.email);
    }

    @Test(dataProvider = "invalidInputsUsername")
    public void tetsUsernameField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.username, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.username);
    }

    @Test(dataProvider = "invalidInputsPassword")
    public void tetsPasswordField(String input, String exeptedErrorMesage) {
        valid.errorValidationSendKewys(locator.password, input);
        var locatorErrorMessage = By.xpath(String.format(ERROR_TEMPLATE, exeptedErrorMesage));
        assertTrue(driver.findElement(locatorErrorMessage).isDisplayed(), "Input is not validation");
        valid.clearInput(locator.password);
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsFirstName() {
        return Stream.of(
                asList(" " + "\n", "Enter your first name"),
                asList("1" + "\n", "First Name require a minimum two characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputLastName() {
        return Stream.of(
                asList(" " + "\n", "Enter your last name"),
                asList("1" + "\n", "Last Name require a minimum two characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsAdress() {
        return Stream.of(
                asList(" " + "\n", "Enter your current address"),
                asList("1" + "\n", "Address require a minimum two characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsCity() {
        return Stream.of(
                asList(" " + "\n", "City required"),
                asList("1" + "\n", "City requires a minimum of 2 characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsPostcodeZip() {
        return Stream.of(
                asList(" " + "\n", "Post Code required"),
                asList("1" + "\n", "Postcode/Zip requires a minimum of 2 characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsPhone() {
        return Stream.of(
                asList(" " + "\n", "Enter your phone or mobile number"),
                asList("12" + "\n", "The length must be a minimum 4 characters"),
                asList("123" + "\n", "The length must be a minimum 4 characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsEmail() {
        return Stream.of(
                asList(" " + "\n", "Enter your email address"),
                asList("1" + "\n", "Email address is invalid")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsUsername() {
        return Stream.of(
                asList(" " + "\n", "Choose a username for your account"),
                asList("1" + "\n", "Username must be at least 2 valid characters")
        ).map(List::toArray).iterator();
    }

    @DataProvider()
    public Iterator<Object[]> invalidInputsPassword() {
        return Stream.of(
                asList(" " + "\n", "Choose a password for your account"),
                asList("1" + "\n", "Password must be at least 8 valid characters"),
                asList("12" + "\n", "Password must be at least 8 valid characters"),
                asList("123" + "\n", "Password must be at least 8 valid characters"),
                asList("1234" + "\n", "Password must be at least 8 valid characters"),
                asList("12345" + "\n", "Password must be at least 8 valid characters"),
                asList("123456" + "\n", "Password must be at least 8 valid characters"),
                asList("1234567" + "\n", "Password must be at least 8 valid characters")
        ).map(List::toArray).iterator();
    }

}

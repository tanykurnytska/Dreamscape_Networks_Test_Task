package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.page.RegistrationPage;

public class RegisrationSteps extends BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;

    public RegisrationSteps (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;}

    RegistrationPage page = new RegistrationPage();


    public void insertFirstName(String firstNameRegistr) {
        driver.findElement(page.firstName).sendKeys(firstNameRegistr);
    }

    public void insertLastName(String lastNameRegistr) {
        driver.findElement(page.lastName).sendKeys(lastNameRegistr);
    }

    public void insertAdress(String addressRegistr) {
        driver.findElement(page.address).sendKeys(addressRegistr);
    }

    public void insertCity(String cityRegistr) {
        driver.findElement(page.city).sendKeys(cityRegistr);
    }

    public void insertPostcodeZip(String postcodeZipRegistr) {
        driver.findElement(page.postcodeZip).sendKeys(postcodeZipRegistr);
    }

    public void clickOnCountry(String countryRegistr) {
        driver.findElement(page.country).sendKeys(countryRegistr);
    }

    public void clickOnSelectCountry() {
        driver.findElement(page.selectCountry).click();
    }

    public void clickOnState(String stateRegistr) {
        driver.findElement(page.state).sendKeys(stateRegistr);
    }

    public void insertPhone(String phoneRegistr) {
        driver.findElement(page.phone).sendKeys(phoneRegistr);
    }

    public void insertEmail(String emailRegistr) {
        driver.findElement(page.email).sendKeys(emailRegistr);
    }

    public void clickOnContactPermission() {
        driver.findElement(page.contactPermission).click();
    }

    public void insertUsername(String usernameRegistr) {
        driver.findElement(page.username).sendKeys(usernameRegistr);
    }

    public void insertPassword(String passwordRegistr) {
        driver.findElement(page.password).sendKeys(passwordRegistr);
    }

    public void clickOnContinueOrder() {
        driver.findElement(page.continueOrder).click();
    }
    public void clickOnMyAccaunt() {
        driver.findElement(page.myAccount).click();
    }public void clickOnLogIn() {
        driver.findElement(page.logIn).click();
    }
    public String getRegistrEmail() {
        return driver.findElement(page.userEmail).getText();
}}
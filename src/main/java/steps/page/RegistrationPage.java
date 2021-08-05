package steps.page;

import org.openqa.selenium.By;

public class RegistrationPage {


    public final By firstName = By.xpath("//*[@id='register_first_name']");
    public final By lastName = By.xpath("//*[@id='register_last_name']");
    public final By address = By.xpath("//*[@id='register_address']");
    public final By city = By.xpath("//*[@id='register_city']");
    public final By postcodeZip = By.xpath("//*[@id='register_post_code']");
    public final By country = By.xpath("//*[@class='select2-search__field']");
    public final By selectCountry = By.xpath("//span[@class='flag ua']");
    public final By state = By.xpath("//input[@id='state_field']");
    public final By selectState = By.xpath("//li[@id='select2-state_field-result-w2yw-ACT']");
    public final By phone = By.xpath("//*[@id='phone_number']");
    public final By email = By.xpath("//*[@id='register_email']");
    public final By contactPermission = By.xpath("//*[@class='control-icon']");
    public final By username = By.xpath("//*[@id='register_username']");
    public final By password = By.xpath("//*[@id='pass']");
    public final By continueOrder = By.xpath("//*[@id='continue_order']");
    public final By myAccount = By.xpath("//*[@class='_s-hide my-account-text']");
    public final By logIn = By.xpath("//*[@id='dropdown_login']");
    public final By userEmail = By.xpath("//span[@class='linkTip tooltip_1']");


}

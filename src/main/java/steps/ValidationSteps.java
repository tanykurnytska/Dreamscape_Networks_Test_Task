package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.Keys.*;

public class ValidationSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public ValidationSteps (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;}

    public void errorValidationSendKewys (By locator,  String input) {
        driver.findElement(locator).sendKeys(input);
    }


   public void clearInput (By locator) {
       driver.findElement(locator).clear();
    }



}

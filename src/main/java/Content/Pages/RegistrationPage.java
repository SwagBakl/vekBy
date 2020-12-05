package Content.Pages;

import Content.framework.Elements.Button;
import Content.framework.Elements.Input;
import org.openqa.selenium.By;

public class RegistrationPage {

    private final Input emailInput = new Input(By.xpath("//input[@autocomplete = 'email']"), "Email input");
    private final Input passwordInput = new Input(By.xpath("//input[@autocomplete = 'current-password']"), "");
    private final Button signInButton = new Button(By.xpath("//div[@class = 'selen-pokdbn5820x']"), "");

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void pressSignInButton() {
        signInButton.press();
    }
}

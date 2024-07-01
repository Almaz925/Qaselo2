package pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    final String EMAIL_CSS = "[placeholder='Work email']";
    final String PASSWORD_CSS = "[placeholder='Password']";
    private final By SUBMIT = (By.xpath("//button[@type='submit']"));

    public LoginPage openPage() {
        open("/login");
        return this;
    }

    public LoginPage login(String user, String pass) {
        $(EMAIL_CSS).sendKeys(user);
        $(PASSWORD_CSS).sendKeys(pass);
        $(SUBMIT).click();
        return this;
    }
}

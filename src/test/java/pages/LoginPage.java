package pages;

import org.openqa.selenium.By;
import utils.PropertyReader;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage{

    public String email, password;
    public static final By PASSWORD_INPUT_LOCATOR = By.xpath("//*[@id='inputPassword']");
    public static final By EMAIL_INPUT_LOCATOR = By.xpath("//*[@id='inputEmail']");

    public void openPage() {
        open("/login");
    }

    public void login() {
        email = System.getenv().getOrDefault("QASE_EMAIL", PropertyReader.getProperty("qase.email"));
        password = System.getenv().getOrDefault("QASE_PASSWORD", PropertyReader.getProperty("qase.password"));
        $(EMAIL_INPUT_LOCATOR).sendKeys(email);
        $(PASSWORD_INPUT_LOCATOR).setValue(password).submit();

    }
}

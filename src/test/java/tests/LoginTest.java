package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @Test (description = "Login with valid data to https://qase.io")
    public void login(){
      loginPage.openPage();
      loginPage.login();
      $(By.id("createButton")).shouldBe(visible);

}

}

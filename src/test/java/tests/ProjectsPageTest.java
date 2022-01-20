package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectsPageTest extends BaseTest {

    @Test(description = "Create new project at qase.io")
    public void createNewProject(){
        loginPage.openPage();
        loginPage.login();
        $(By.id("createButton")).click();
        $(By.id("inputTitle")).sendKeys("test project Name");
        $(By.id("inputCode")).sendKeys("TPN");
        $(By.id("inputDescription")).sendKeys("test project Description");
        $(By.id("public-access-type")).click();
        $(By.xpath("//button[@class='btn btn-primary']")).click();
        $(By.xpath("//span[@class='nav-link-title']")).click();
        $(By.id("createButton")).shouldBe(visible);

    }
}

package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreateTestCaseTest extends BaseTest {

    @Test(description = "Create new test case at qase.io")
    public void createNewProject(){
        open("/login");


    }

}

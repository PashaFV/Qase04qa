package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;


public class CreateTestCaseTest extends BaseTest {

    @Test(description = "Create new test case at last created project")
    public void createNewProject() {
        loginPage.openPage();
        loginPage.login();
        createCasePage.createNewTestCase();

    }

}

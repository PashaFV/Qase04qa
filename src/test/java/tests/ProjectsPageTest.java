package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tests.BaseTest;

public class ProjectsPageTest extends BaseTest {

    @Test(description = "Create new project at qase.io")
    public void createNewProject() {
        loginPage.openPage();
        loginPage.login();
        projectsPage.createNewProject();

    }
}

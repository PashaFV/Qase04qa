package tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.CreateCasePage;
import pages.LoginPage;
import pages.ProjectsPage;
import utils.PropertyReader;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginPage loginPage;
    ProjectsPage projectsPage;
    CreateCasePage createCasePage;

    @BeforeClass
    public void setUp() {
        //Configuration.headless = true;
        Configuration.baseUrl = System.getenv().getOrDefault("QASE_URL", PropertyReader.getProperty("qase.url"));
        Configuration.browser = "firefox";
        Configuration.clickViaJs = true;
        Configuration.timeout = 100000;
        Configuration.savePageSource = false;

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();
        createCasePage = new CreateCasePage();

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("headless");
//        Configuration.browserCapabilities = chromeOptions;
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        //getWebDriver().quit();

    }
}

package pages;

import com.codeborne.selenide.Condition;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    static Faker faker = new Faker();

    public static final By CREATE_NEW_PROJECT_BUTTON = By.id("createButton");
    public static final By PROJECT_NAME_INPUT = By.id("inputTitle");
    public static final By PROJECT_CODE_INPUT = By.id("inputCode");
    public static final By PROJECT_DESC_INPUT = By.id("inputDescription");
    public static final By PRIVATE_ACCESS_PRIVATE = By.id("public-access-type");
    public static final By CREATE_PROJECT_BUTTON = By.xpath("//button[@class='btn btn-primary']");
    public static final By PROJECT_BUTTON = By.xpath("//span[@class='nav-link-title']");
    public static final By CREATE_NEW_CASE_BUTTON = By.xpath("//span[@class='style_contentWrapper-2Qmrg'][text()='Create new case']");


    public void createNewProject() {
        $(CREATE_NEW_PROJECT_BUTTON).click();
        $(PROJECT_NAME_INPUT).setValue(faker.book().title());
        $(PROJECT_CODE_INPUT).setValue(faker.code().asin());
        $(PROJECT_DESC_INPUT).setValue(faker.lordOfTheRings().location());
        $(PRIVATE_ACCESS_PRIVATE).click();
        $(CREATE_PROJECT_BUTTON).click();
        $(CREATE_NEW_CASE_BUTTON).shouldBe(visible);
    }


}

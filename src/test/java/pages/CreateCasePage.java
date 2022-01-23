package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CreateCasePage {

    static Faker faker = new Faker();

    public static final By LAST_PROJECT_NAME = By.xpath("(//a[@class='defect-title'])[last()]");
    public static final By CREATE_CASE_BUTTON = By.id("create-case-button");
    public static final By TITLE_INPUT = By.id("title");
    public static final By SAVE_CASE_BUTTON = By.id("save-case");
    public static final By DESCRIPTION_INPUT = By.xpath("(//p[@class='empty-node'])");
    public static final By PRE_CONDITIONS_INPUT = By.xpath("(//p[@class='empty-node'])[2]");
    public static final By STATUS_DROPDOWN = By.xpath("//div[@class=' css-io3r9z-singleValue'][normalize-space()='Deprecated']");
    public static final By TITLE_TEST_CASES = By.xpath("//span[@class='style_titleText-3QMtk']");


    public void createNewTestCase() {
        $(LAST_PROJECT_NAME).click();
        $(CREATE_CASE_BUTTON).click();
        $(TITLE_INPUT).setValue(faker.twinPeaks().location());
        $(DESCRIPTION_INPUT).setValue(faker.lordOfTheRings().location());
        $(PRE_CONDITIONS_INPUT).setValue(faker.lordOfTheRings().location());
        $(PRE_CONDITIONS_INPUT).setValue(faker.lordOfTheRings().location());
        $(SAVE_CASE_BUTTON).click();
        $(TITLE_TEST_CASES).shouldBe(visible);


    }
}

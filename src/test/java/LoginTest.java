import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
      open("/login");
      $("#inputEmail").sendKeys("pashafv4@gmail.com");
      $(By.xpath("//*[@id='inputPassword']")).setValue("3812Pasha").submit();
      $(By.id("createButton")).shouldBe(visible);

}
}

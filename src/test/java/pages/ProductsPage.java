package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProductsPage {
    final String TITLE_CSS = "//h1[text()='Projects']";

    public void openPage() {
        open("/projects");
    }
    public void waitTillpened() {
        $(TITLE_CSS).shouldBe(Condition.visible);
        $(byText("")).click();

    } public void projectExist() {
        $$(By.xpath("//tr//a")).findBy(text("Demo Project")).shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

}

package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {
    private static final String MAIN_PAGE_URL = "https://www.petshop.ru";
    private static final String TITLE_TEXT = "Товары для животных, зоотовары онлайн, корма для домашних животных купить в интернет-магазине Petshop.ru";
    private static final String CITY = "Санкт-Петербург";
    private static final String MAIN_PAGE_TITLE = "Интернет-магазин Petshop.ru";

    @BeforeEach
    void beforeEach() {
        open(MAIN_PAGE_URL);
    }

    @Test
    @Description("Main page test")
    @DisplayName("Main page title should have header text")
    void titleTest() {
        step("Main page title should have header text", () -> {
            assertThat(title()).isEqualTo(TITLE_TEXT);
        });
    }

    @Test
    @Description("Main page test")
    @DisplayName("Page title")
    void pageTitleTest() {
        step("The title should be on the main page", () -> {
            $(".main-page-title").shouldHave(Condition.text(MAIN_PAGE_TITLE));
        });
    }

    @Test
    @Description("Main page test")
    @DisplayName("City in choosing city popup")
    void choosingCityTest() {
        step("City in choosing city popup", () -> {
            $(".cityHint_hint__city__SI4-r").shouldHave(Condition.text(CITY));
        });
    }

    @Test
    @Description("Main page test")
    @DisplayName("City in header after confirming city in choosing city popup")
    void cityAfterChoiceTest() {
        step("Confirm city in choosing city popup", () -> {
            $(byText("Да, спасибо")).shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        });

        step("City in header", () -> {
            $(byAttribute("data-testid", "City")).shouldHave(Condition.text(CITY));
        });
    }

    @Test
    @Description("Main page test")
    @DisplayName("City choosing window after declining city choosing popup")
    void decliningCityChoosingPopupTest() {
        step("Decline city in choosing city popup", () -> {
            $(byText("Нет, другой")).shouldBe(Condition.visible, Duration.ofSeconds(20)).click();
        });

        step("City choosing window is visible", () -> {
            $(byAttribute("data-testid", "DialogWindow__wrap")).shouldBe(Condition.visible);
        });
    }
}
package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static cloud.autotests.tests.TestData.NUMBER_OF_PRODUCTS;
import static cloud.autotests.tests.TestData.PRODUCT_NAME;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductPageTests extends TestBase {

    @Test
    @Description("Проверка страницы товара")
    @DisplayName("В заголовке страницы должно содержаться название товара")
    void titleTest() {
        step("В заголовке страницы должно содержаться название товара", () -> {
            assertThat(title()).startsWith(PRODUCT_NAME);
        });
    }

    @Test
    @Description("Проверка страницы товара")
    @DisplayName("На странице присутствует название товара")
    void productNameTest() {
        step("На странице присутствует название товара", () -> {
             $(byAttribute("data-testid", "ProductTitle__title")).shouldHave(Condition.exactText(PRODUCT_NAME));
        });
    }

    @Test
    @Description("Проверка страницы товара")
    @DisplayName("На странице присутствует артикул товара")
    void productArticleTest() {
        step("На странице присутствует артикул товара", () -> {
            $(byAttribute("data-testid", "ProductArticle")).shouldBe(Condition.visible);
        });
    }

    @Test
    @Description("Проверка страницы товара")
    @DisplayName("Уведомление о добавлении в корзину при нажатии кнопки добавления в корзину")
    void addToCartNotifierTest() {
        step("Нажатие кнопки добавления в корзину", () -> {
            $(".style_button_text__1YcYq").click();
        });
        step("Появляется уведомление о добавлении в корзину", () -> {
            $(byAttribute("data-testid", "Notifier-success")).shouldHave(Condition.text("Товар добавлен в корзину"));
        });
    }

    @Test
    @Description("Проверка страницы товара")
    @DisplayName("Отображение количества добавленного товара на кнопке добавления в корзину после добавления товара в корзину")
    void addToCartButtonCounterTest() {
        step("Выставление количества товара", () -> {
            $(byAttribute("data-testid", "QuantityCounter__input")).setValue(NUMBER_OF_PRODUCTS);
        });
        step("Нажатие кнопки добавления в корзину", () -> {
            $(".style_button_text__1YcYq").click();
        });
        step("На кнопке добавления в корзину отображается число товаров в корзине", () -> {
            $(byAttribute("data-testid", "CartButton__counter")).shouldHave(Condition.exactText(NUMBER_OF_PRODUCTS));
        });
    }

    @Test
    @Description("Проверка страницы товара")
    @DisplayName("Надпись \"Добавить еще\" на кнопке добавления в корзину после добавления товара в корзину")
    void addToCartButtonNameTest() {
        step("Нажатие кнопки добавления в корзину", () -> {
            $(".style_button_text__1YcYq").click();
        });
        step("На кнопке добавления в корзину отображается надпись \"Добавить еще\"", () -> {
            $(".style_button_text__1YcYq").shouldHave(Condition.exactText("Добавить еще"));
        });
    }
}

package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductPageTests {

    @Test
    @Description("Product page test")
    @DisplayName("Product page should contain product name")
    void titleTest() {
        step("Open product page", () ->
                open("https://www.petshop.ru/catalog/dogs/lezaki/domik_uyutnoe_gnezdyshko_s_ushkami_sherst_forma_krug_siniy_l_40x40x20sm_25186/"));

        step("There is a product name on the product page", () -> {
            String expectedTitle = "Товары для животных, зоотовары онлайн, корма для домашних животных купить в интернет-магазине Petshop.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }
}

package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Открытие страницы \"Nedra\"")
    void generatedTest() {
        step("Открыть страницу https://nedra.digital/", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие на странице разделов \"О компании\", \"Блог\", \"Стажировка\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить переход на раздел \"Стажировка\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Перейти на главную страницу  https://nedra.digital/", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать на раздел \"Стажировка\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие заглавия на странице \"NEDRA STREAM\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить переход на вакансии в Head Huntere", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть главную страницу   https://nedra.digital/", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать на ссылку  \"Head Hunter\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие текста \"Nedra - New Digital Resources for Assets\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверка вакансий", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть страницу https://nedra.digital/", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать на \"Смотреть Вакансии\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Выбрать раздел \"Разработка\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие вакансии \"DevOps Engineer\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверка вакансий", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть страницу https://nedra.digital/", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать на раздел \"Блог\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Найти статью \"«Недра»: свежие идеи и возможности\"", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://nedra.digital/'", () ->
            open("https://nedra.digital/"));

        step("Page title should have text 'Nedra - New Digital Resources for Assets'", () -> {
            String expectedTitle = "Nedra - New Digital Resources for Assets";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://nedra.digital/'", () ->
            open("https://nedra.digital/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
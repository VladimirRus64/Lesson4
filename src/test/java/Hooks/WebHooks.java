package Hooks;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.restassured.AllureRestAssured;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;

public class WebHooks {
    @BeforeClass
    public static void before() {
        RestAssured.filters(new AllureRestAssured());
    }

    @BeforeAll
    public static void setDriver() {
        Configuration.startMaximized = true;
        Configuration.timeout = 120000;
    }
    @BeforeAll
    static void setAllure() {
        new AllureSelenide()
                .screenshots(true)
                .savePageSource(false);
    }
}



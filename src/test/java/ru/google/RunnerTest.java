package ru.google;

import com.codeborne.selenide.Configuration;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(  monochrome = true,
        tags = "@all",
        features = "src/test/java/ru/google/features/",
        glue = "ru.google",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false)

public class RunnerTest {
    @Before
    public void setUp() {
        System.setProperty("webdriver.geckodriver.driver", "src/main/resources/geckodriver.exe");
        Configuration.browser = "chrome";
    }
}
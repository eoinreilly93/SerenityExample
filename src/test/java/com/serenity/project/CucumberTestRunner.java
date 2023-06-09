package com.serenity.project;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "not (@Ignore or @UI)",
        plugin = {
                "pretty"
        }
)
public class CucumberTestRunner {

}

package com.Carepay.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/Carepay/BDD/FeatureFile",
        plugin = {"pretty","html:test-output/x.html"},
        glue = {"com"},
        tags ="@Smoke"


)
public class Runner {
}

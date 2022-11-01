package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features ="target/test-classes/orange.feature" ,glue = "StepDefination")
    public class runner {
    }




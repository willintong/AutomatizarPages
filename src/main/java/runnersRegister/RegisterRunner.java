package runnersRegister;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "projectFeatureRegister", glue = "stepDefinitionRegister")
public class RegisterRunner {

}

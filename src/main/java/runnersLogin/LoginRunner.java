package runnersLogin;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "projectFeature", glue = "stepDefinition")
public class LoginRunner {

}

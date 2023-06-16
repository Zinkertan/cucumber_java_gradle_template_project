package steps;

import base.TestsContext;
import io.cucumber.java.Scenario;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseStepDefinitions {
    protected Scenario scenario;

    @Autowired
    protected TestsContext testsContext;

}

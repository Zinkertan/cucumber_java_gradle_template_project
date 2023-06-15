package io.cucumber.skeleton.steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.skeleton.Belly;
import io.cucumber.skeleton.TestsContext;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefinitions {
    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Autowired
    TestsContext testsContext;
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
        System.out.println(testsContext.a);
        scenario.log(String.valueOf(testsContext.a));
        testsContext.a = cukes;
        System.out.println(testsContext.a);
        scenario.log(String.valueOf(testsContext.a));
    }
}

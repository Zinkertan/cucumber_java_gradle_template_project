package base;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
public class TestsContext {
    TestsContext(){
        a = 1;
    }
    public int a;
}

package steps;

import io.cucumber.java.*;
import utils.Utilities;
import io.cucumber.java.en.And;

public class CommonSteps extends Utilities {

    @Before
    public void startDriver()
    {
        initialize();
    }

    @And("Exit")
    public void terminateDriver()
    {
       terminate();
    }

    @And("Navigate to {}")
    public void browserNavigate(String url)
    {
        navigate(url);
    }

    @And("Wait for {}")
    public void browserNavigate(double duration)
    {
        waitFor(duration);
    }
}
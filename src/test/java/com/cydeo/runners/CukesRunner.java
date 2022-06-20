package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = true,
        // dryRun = true,
        //tags = "@Regression"
        // tags = " @librarian"
        //tags = "@librarian or  @student"
        // tags = "@employee"
        // tags = "@employee and @admin"
        // tags = "@Regression and not @student"
        //tags = "@wip"
        tags = " @dice  "
     //   tags = "@scenarioOutline"


)
public class CukesRunner {


}

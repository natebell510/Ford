package com.ford.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        glue = "com/ford/step_defs",
        features = "src/test/resources/features",
        dryRun = false,
        publish = false,
        tags = ""

)

public class CucRunner {
}

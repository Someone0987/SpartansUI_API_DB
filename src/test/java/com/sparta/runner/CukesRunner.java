
package com.sparta.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",

        },
        features = "src/test/resources/features" ,
        glue = "com/sparta/step_defs",
        dryRun = false,
        tags = ""
)
public class CukesRunner {

}




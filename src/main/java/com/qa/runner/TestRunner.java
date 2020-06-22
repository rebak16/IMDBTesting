package com.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/home/rebak/Codecool/Codecool Rooms/Test Automation/Jobhunt/IMDBTesting/src/main/java/com/qa/features/advancedSearch.feature"},
        glue = {"com.qa.stepDefinitions"},
//, format= {"pretty","html:test-outout"}
        monochrome = true,
        strict = true,
        dryRun = false
)
public class TestRunner {
}
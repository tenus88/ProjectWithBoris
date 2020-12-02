package com.vytruck.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",      //always starts from the 'src'
        glue     = "com/vytruck/stepDefenitions",   //always starts from the 'com' AND //HOOKS RUNNING BY THE GLUE
        dryRun   = false,
        tags     = "@login"
        //publish = false

)


public class CucumberRunner {

}

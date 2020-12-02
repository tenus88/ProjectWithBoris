package com.vytruck.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class RunnerClass {



    @RunWith(Cucumber.class)
    @CucumberOptions(
         //   plugin   = {"html:target/cucumber-report.html",
          //          "json:target/cucumber.json",
         //           "rerun:target/rerun.txt"
         //   },
            features = "src/test/resources/features",      //always starts from the 'src'
            glue     = "com/briteERP/stepDefinitions",   //always starts from the 'com' AND //HOOKS RUNNING BY THE GLUE
            dryRun   = false,
            tags     = ""
       //     publish = true

    )


    public class CucumberRunner{

    }
}

//Hello, Boris!

// Andrei nigga chudo yudo bratuha

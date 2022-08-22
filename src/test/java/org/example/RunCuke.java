package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
// . = it will consider all at the same level , tags =[(include tags which you want to run {With logical operators AND OR}) ex. @regration @smoke @abc] , [plugin = HTML report and thr path of it.]
    @CucumberOptions(features = ".",tags= "@cat or @reg",plugin = {"pretty","html:target/cucumber-reports.html"})

    public class RunCuke{
    }



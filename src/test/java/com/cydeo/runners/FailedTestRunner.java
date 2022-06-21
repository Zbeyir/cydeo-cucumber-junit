package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt"

)

// day 18 sonra bu class actik
// CukesRunner class da ki aciklama nin  yanindaki den sonra
/*
yani önce fail olan testler icin bir yer actik, sonra bu sinifi actik ,
sonra bu sinfin feature ' i ni sadece failed testlere yönlendirdik
ve bu class sadece failed test leri run ediyor
fotolari da var bak
 */

public class FailedTestRunner {


}

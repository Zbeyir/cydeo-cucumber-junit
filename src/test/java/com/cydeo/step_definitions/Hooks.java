package com.cydeo.step_definitions;

/*
This class we will be able to pass pre- & post- conditions to each scenario and each step
 */

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before; // bu after ve before sececegiz baska la rini degil dikkat
import io.cucumber.java.BeforeStep;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 1)  // bu hepsinde calisacak , ama digerleri hangi @annotation varsa orada calisacak
    public void setupScenario(){
        System.out.println("====setting up browser using cucumber @Before");
    }

    @Before(value = "@login",order = 2)
    public void setupScenarioForLogins(){
        System.out.println("====this will only apply to scenarios with @login tag");
    }

    @Before(value = "@db", order = 0)
    public void setupForDatabaseScenario(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(){

        Driver.closeDriver();

        // System.out.println("====Closing browser using cucumber @After");
       // System.out.println("====Scenario ended/ Take screenshot if failed!");

    }

    @BeforeStep
    public void setupStep(){
        System.out.println("--------------> applying setup using @BeforeStep");

    }

    @AfterStep
    public void afterStep(){
        System.out.println("-------------> applying tearDown using @AfterStep");

    }



}

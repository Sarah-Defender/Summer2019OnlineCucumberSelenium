package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import cucumber.runtime.Utils;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.Scanner;

public class Hook {

    @Before
    public void setup(){
        System.out.println("===============================");

        System.out.println("Test setup!");
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test failed!");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
       //after every test we're gonna close the browser
        Driver.close();
    }



}

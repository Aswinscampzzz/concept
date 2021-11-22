package com.runner.org;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cumfea\\org\\Pratice.feature",glue="\\com\\stepdefinition\\org\\Stepdef.java")

public class Runnerclass {

}

package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="cucumber_features",
glue="stepdefinations",
tags="@smoke or @regression",
monochrome=true,
plugin= {"pretty","html:target\\cucumberreprt.html",
       "pretty","json:target\\cucumberreprt.json"}
)
public class runner {

}

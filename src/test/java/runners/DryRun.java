package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/features",
<<<<<<< HEAD
                 glue="step_defintions",
                 dryRun=true,
                 tags ="@forgotPassword"
=======
                 glue="step_definitions",
                 dryRun=true,
                 tags ="@Login"
>>>>>>> df8a8b8e9bf34a841105ab76d3edb67a9a1b6e0d
             )
public class DryRun {

}

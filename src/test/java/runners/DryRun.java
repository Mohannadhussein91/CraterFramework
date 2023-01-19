package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/resources/Features",
                 glue="Step_Definitions",
                 dryRun=true,
                 tags ="@CustomerPage"
             )
public class DryRun {

}

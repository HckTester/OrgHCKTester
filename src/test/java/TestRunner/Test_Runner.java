package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:/Users/rajatg/eclipse-workspace/Z_A_Haier/src/test/resources/Features/Haier.feature",
		                    },
glue= {"Haier_Step"},plugin = {"pretty",
		                //"json:target/cucumber-reports/Cucumber.json",
		                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		                },
	
monochrome = true,
publish = true
//tags= "@Scenario_One_and_Two,@Scenario_Three,@Scenario_Four,@Scenario_Five"
	)















public class Test_Runner {

}

package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="C:\\Users\\himesh\\eclipse-workspace\\cucumber_t\\features\\MyApplication.feature",
		glue= {"stepDefination"})
public class TestRunner {

}

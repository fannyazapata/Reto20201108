package GradleJunitSerenityCucumberScreenPlay02.runners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/Utest.feature",
                  tags = "@stories",
                  glue = "GradleJunitSerenityCucumberScreenPlay02.stepdefinitions",
                  snippets = SnippetType.CAMELCASE)


public class RunnerTags {

}

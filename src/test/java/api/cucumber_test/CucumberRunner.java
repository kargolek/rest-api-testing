package api.cucumber_test;

import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        monochrome = true,
        features = { "src/test/resources"},
        glue = { "api.cucumber_test"},
        plugin = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        strict = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {

   @After
   public void tearDown(){
       DataShared.getInstance().setTempPathRequest("");
   }
}

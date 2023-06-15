package io.cucumber.skeleton;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("io/cucumber/skeleton")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:build/cucumber-reports.html")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.cucumber.skeleton")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@my")
@ConfigurationParameter(key = PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME, value = "true")

public class RunCucumberTest extends SpringDemoApplication{
//    public static void main(String[] args) {
//        SpringApplication.run(RunCucumberTest.class, args);
//    }

}

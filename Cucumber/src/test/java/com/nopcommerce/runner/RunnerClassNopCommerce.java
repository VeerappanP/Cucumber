package com.nopcommerce.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src\\test\\java\\FeatureFile\\nopcommerce.feature" }, 
		dryRun = !true, 
		glue = {"com.nopcommerce.step" }, 
		snippets = SnippetType.CAMELCASE, 
		monochrome = true,
		plugin = {"html:Report/Nopcommerce.html","pretty"}
		)
public class RunnerClassNopCommerce  {

	

}

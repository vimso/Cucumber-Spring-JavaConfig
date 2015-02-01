package com.vimso.pruebas.cucumberprueba.cucumber;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author vimso
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:features", format = { "pretty", "html:target/cucumber" })
public class CucumberTest {

}

package com.vimso.pruebas.cucumberprueba.cucumber;

import com.vimso.pruebas.cucumberprueba.servicio.IServicio;
import static org.junit.Assert.assertNotNull;


import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import javax.inject.Inject;
import static org.junit.Assert.assertEquals;

public class SumaSteps {
//
	@Inject
	private IServicio servicio;
//	
	@Given("cargada la app")
	public void an_application() {
		assertNotNull(servicio);
	}

	@Then("suma dos numeros")
	public void say_something() {
////            Suma
            int valor = servicio.suma(2, 3);
            assertEquals(valor, 5);
	}
}

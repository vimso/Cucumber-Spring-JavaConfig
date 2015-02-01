package com.vimso.pruebas.cucumberprueba.servicio;

import com.vimso.pruebas.cucumberprueba.conf.SpringContext;
import com.vimso.pruebas.cucumberprueba.servicio.IServicio;
import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author vimso
 */
@ContextConfiguration(classes={SpringContext.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class ServicioImpleTest {
    
    @Inject
    IServicio servicio;
    
    public ServicioImpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class ServicioImple.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int sumandoA = 0;
        int sumandoB = 0;
        int expResult = 0;
        int result = servicio.suma(sumandoA, sumandoB);
        assertEquals(expResult, result);
    }
    
}

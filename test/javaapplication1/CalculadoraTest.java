/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aula2
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of somar method, of class Calculadora.
     */


    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        Calculadora calculadora = new Calculadora();
        double r1 = 1.0;
        double r2 = 2.0;
        double somar = calculadora.somar(r1, r2);
        assertEquals (3.0,somar,0);
       
    }
    
}

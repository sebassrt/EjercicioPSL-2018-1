/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopsl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ImpresorLCDTest {
    
    public ImpresorLCDTest() {
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
     * Test of procesar method, of class ImpresorLCD.
     */
    @Test
    public void testProcesar() {
        System.out.println("procesar");
        //Para probarlo, correrlo con la siguiente entrada.
        String comando = "3,123";
        int espacioDig = 1;
        ImpresorLCD instance = new ImpresorLCD();
        instance.procesar(comando, espacioDig);
        
        
    }

    /**
     * Test of IngresoEntrada method, of class ImpresorLCD.
     */
    
    @Test
    public void testIngresoEntrada() {
        System.out.println("IngresoEntrada");
        ImpresorLCD instance = new ImpresorLCD();
        instance.IngresoEntrada();
        
    }

    /**
     * Test of isNumeric method, of class ImpresorLCD.
     */
    
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
       
        boolean expResult = true;
        boolean result;
        result = ImpresorLCD.isNumeric("4554");
        assertEquals(expResult, result);
                
    }
    
    
      
}

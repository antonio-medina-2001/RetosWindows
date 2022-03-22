/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 34616
 */
public class MaxTest {
    
    public MaxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    // Aqui realizo la prueba de cardinalidad
    @Test
    public void testCardinalidadMax() 
    {
        System.out.println("cardinalidadMax");
        assertEquals(0, Max.max(new int[] {}));
        assertEquals(5, Max.max(new int[] {5}));
        assertEquals(5, Max.max(new int[] {-5, 5, 0}));   
    }
    
    
    // Aqui realizo la prueba de orden
    @Test
    public void testOrdenMax()
    {
        System.out.println("ordenMax");
        assertEquals(5, Max.max(new int[] {3, 5, 0}));
        assertEquals(5, Max.max(new int[] {5, 3, 0}));
        assertEquals(5, Max.max(new int[] {0, 3, 5}));
    }
    
    // Aqui realizo la prueba de rango
    @Test
    public void testRangoMax()
    {
        System.out.println("rangoMax");
        assertEquals(0, Max.max(new int[]{Integer.MIN_VALUE, 0}));
        assertEquals(Integer.MAX_VALUE, Max.max(new int[]{0, Integer.MAX_VALUE}));
        assertEquals(Integer.MAX_VALUE, Max.max(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE}));        
    }

    // Aqui realizo la prueba de existencia
    @Test (expected=NullPointerException.class)
    public void testExistenciaMax()
    {
        System.out.println("existenciaMax");
        assertEquals(0, Max.max(new int[] {}));
        assertEquals(0, Max.max(new int[] {0}));
        assertEquals(null, Max.max(null));        
    }
    
}

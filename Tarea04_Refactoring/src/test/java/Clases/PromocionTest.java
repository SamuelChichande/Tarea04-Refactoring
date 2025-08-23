/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Cesar Moreira
 */
public class PromocionTest {
    
    public PromocionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDescripcion method, of class Promocion.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Promocion instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Promocion.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Promocion instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class Promocion.
     */
    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        Promocion instance = null;
        float expResult = 0.0F;
        float result = instance.getDescuento();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento method, of class Promocion.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        float descuento = 0.0F;
        Promocion instance = null;
        instance.setDescuento(descuento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    @DisplayName("Comprobar getters y setters")
    public void P1() {
        Promocion p = new Promocion("Promo", 0.2f);
        p.setDescripcion("Nueva");
        p.setDescuento(0.3f);
        assertEquals("Nueva", p.getDescripcion());
        assertEquals(0.3f, p.getDescuento());
    }
}

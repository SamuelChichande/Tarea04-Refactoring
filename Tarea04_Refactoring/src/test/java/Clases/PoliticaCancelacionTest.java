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
public class PoliticaCancelacionTest {
    
    public PoliticaCancelacionTest() {
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
     * Test of getDescripcion method, of class PoliticaCancelacion.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        PoliticaCancelacion instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class PoliticaCancelacion.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        PoliticaCancelacion instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class PoliticaCancelacion.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PoliticaCancelacion instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PoliticaCancelacion.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        PoliticaCancelacion instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    @DisplayName("Comprobar getters y setters")
    public void PC1() {
        PoliticaCancelacion pc = new PoliticaCancelacion(1, "Regla");
        pc.setId(2);
        pc.setDescripcion("Regla2");
        assertEquals(2, pc.getId());
        assertEquals("Regla2", pc.getDescripcion());
    }
    
}

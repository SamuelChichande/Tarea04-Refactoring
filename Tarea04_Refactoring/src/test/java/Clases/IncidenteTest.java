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
public class IncidenteTest {
    
    public IncidenteTest() {
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
     * Test of getIncidente method, of class Incidente.
     */
    @Test
    public void testGetIncidente() {
        System.out.println("getIncidente");
        Incidente instance = null;
        String expResult = "";
        String result = instance.getIncidente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIncidente method, of class Incidente.
     */
    @Test
    public void testSetIncidente() {
        System.out.println("setIncidente");
        String incidente = "";
        Incidente instance = null;
        instance.setIncidente(incidente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Incidente.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Incidente instance = null;
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Incidente.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Incidente instance = null;
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportadoPor method, of class Incidente.
     */
    @Test
    public void testGetReportadoPor() {
        System.out.println("getReportadoPor");
        Incidente instance = null;
        Usuario expResult = null;
        Usuario result = instance.getReportadoPor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportadoPor method, of class Incidente.
     */
    @Test
    public void testSetReportadoPor() {
        System.out.println("setReportadoPor");
        Usuario reportadoPor = null;
        Incidente instance = null;
        instance.setReportadoPor(reportadoPor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
    
    @Test
    @DisplayName("Comprobar getters y setters")
    public void I1() {
        Usuario rep = new Usuario("Ana","a@mail.com");
        Incidente i = new Incidente("Desc","Pendiente", rep);
        i.setEstado("Cerrado");
        assertEquals("Cerrado", i.getEstado());
        assertSame(rep, i.getReportadoPor());
    }
}

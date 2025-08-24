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

    IncidenteTest() {
        // Constructor vacío intencional: requerido por JUnit para instanciar la clase de prueba
    }

    @BeforeAll
    static void setUpClass() {
        // Intencionalmente vacío: no se requiere configuración global antes de las pruebas
    }

    @AfterAll
    static void tearDownClass() {
        // Intencionalmente vacío: no se requiere limpieza global después de las pruebas
    }

    @BeforeEach
    void setUp() {
        // Intencionalmente vacío: no se necesita inicialización previa por cada prueba
    }

    @AfterEach
    void tearDown() {
        // Intencionalmente vacío: no se necesita limpieza posterior a cada prueba
    }

    /**
     * Test of getIncidente method, of class Incidente.
     */
    @Test
    void testGetIncidente() {
        System.out.println("getIncidente");
        Incidente instance = null;
        String expResult = "";
        String result = instance.getIncidente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIncidente method, of class Incidente.
     */
    @Test
    void testSetIncidente() {
        System.out.println("setIncidente");
        String incidente = "";
        Incidente instance = null;
        instance.setIncidente(incidente);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Incidente.
     */
    @Test
    void testGetEstado() {
        System.out.println("getEstado");
        Incidente instance = null;
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Incidente.
     */
    @Test
    void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Incidente instance = null;
        instance.setEstado(estado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReportadoPor method, of class Incidente.
     */
    @Test
    void testGetReportadoPor() {
        System.out.println("getReportadoPor");
        Incidente instance = null;
        Usuario expResult = null;
        Usuario result = instance.getReportadoPor();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReportadoPor method, of class Incidente.
     */
    @Test
    void testSetReportadoPor() {
        System.out.println("setReportadoPor");
        Usuario reportadoPor = null;
        Incidente instance = null;
        instance.setReportadoPor(reportadoPor);
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("Comprobar getters y setters")
    void I1() {
        Usuario rep = new Usuario("Ana", "a@mail.com");
        Incidente i = new Incidente("Desc", "Pendiente", rep);
        i.setEstado("Cerrado");
        assertEquals("Cerrado", i.getEstado());
        assertSame(rep, i.getReportadoPor());
    }
}

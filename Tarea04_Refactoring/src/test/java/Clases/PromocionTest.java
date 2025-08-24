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
class PromocionTest {

    PromocionTest() {
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
     * Test of getDescripcion method, of class Promocion.
     */
    @Test
    void testGetDescripcion() {
        System.out.println("getDescripcion");
        Promocion instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Promocion.
     */
    @Test
    void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Promocion instance = null;
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class Promocion.
     */
    @Test
    void testGetDescuento() {
        System.out.println("getDescuento");
        Promocion instance = null;
        float expResult = 0.0F;
        float result = instance.getDescuento();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento method, of class Promocion.
     */
    @Test
    void testSetDescuento() {
        System.out.println("setDescuento");
        float descuento = 0.0F;
        Promocion instance = null;
        instance.setDescuento(descuento);
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("Comprobar getters y setters")
    void P1() {
        Promocion p = new Promocion("Promo", 0.2f);
        p.setDescripcion("Nueva");
        p.setDescuento(0.3f);
        assertEquals("Nueva", p.getDescripcion());
        assertEquals(0.3f, p.getDescuento());
    }
}

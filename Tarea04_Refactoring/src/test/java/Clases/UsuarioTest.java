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
class UsuarioTest {

    UsuarioTest() {
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
     * Test of getNombre method, of class Usuario.
     */
    @Test
    void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = null;
        instance.setNombre(nombre);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = null;
        instance.setEmail(email);
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("Comprobar getters y setters")
    void U1() {
        Usuario u = new Usuario("N", "E");
        u.setNombre("X");
        u.setEmail("Y");
        assertEquals("X", u.getNombre());
        assertEquals("Y", u.getEmail());
    }

}

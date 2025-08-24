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
class SoporteClienteTest {

    SoporteClienteTest() {
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
     * Test of escalarIncidente method, of class SoporteCliente.
     */
    @Test
    void testEscalarIncidente() {
        System.out.println("escalarIncidente");
        Incidente incidente = null;
        SoporteCliente instance = null;
        instance.escalarIncidente(incidente);
        fail("The test case is a prototype.");
    }

    /**
     * Test of solucionarIncidente method, of class SoporteCliente.
     */
    @Test
    void testSolucionarIncidente() {
        System.out.println("solucionarIncidente");
        Incidente incidente = null;
        SoporteCliente instance = null;
        instance.solucionarIncidente(incidente);
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("Comprobar que el metodo no falla ante una entrada valida")
    void SC1() {
        AdministradorEvento ad = new AdministradorEvento("Admin", "a@mail.com");
        Incidente inc = new Incidente("Falla", "Pendiente", new Usuario("U", "u@mail.com"));

        assertDoesNotThrow(() -> ad.solucionarIncidente(inc));

    }

    @Test
    @DisplayName("Comprobar que el metodo no falla ante una entrada valida")
    void SC2() {
        SoporteCliente sc = new SoporteCliente("Soporte", "s@mail.com");
        Incidente inc = new Incidente("Caida", "Pendiente", new Usuario("U", "u@mail.com"));

        assertDoesNotThrow(() -> sc.escalarIncidente(inc));
    }

}

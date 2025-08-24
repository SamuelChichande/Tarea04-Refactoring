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
class EventoMicroTeatroTest {

    EventoMicroTeatroTest() {
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
     * Test of agregarFuncion method, of class EventoMicroTeatro.
     */
    @Test
    void testAgregarFuncion() {
        System.out.println("agregarFuncion");
        String titulo = "";
        String descripcion = "";
        EventoMicroTeatro instance = null;
        instance.agregarFuncion(titulo, descripcion);
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("Comprobar entrada valida de datos")
    void EMT1() {
        EventoMicroTeatro evento = new EventoMicroTeatro("Nuevo", "Desc");
        assertThrows(RuntimeException.class, () -> evento.agregarFuncion("titulo", "descripcion"));
    }

    @Test
    @DisplayName("Comprobar entrada de datos vacia")
    void EMT2() {
        EventoMicroTeatro evento = new EventoMicroTeatro("Nuevo", "Desc");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> evento.agregarFuncion("", ""));

        assertEquals("Titulo/descripcion no pueden ser vacios", exception.getMessage());
    }

}

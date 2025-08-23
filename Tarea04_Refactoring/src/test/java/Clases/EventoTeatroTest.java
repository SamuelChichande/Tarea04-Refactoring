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
public class EventoTeatroTest {
    
    public EventoTeatroTest() {
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
     * Test of agregarFuncion method, of class EventoTeatro.
     */
    @Test
    public void testAgregarFuncion() {
        System.out.println("agregarFuncion");
        String titulo = "";
        String descripcion = "";
        EventoTeatro instance = null;
        instance.agregarFuncion(titulo, descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    @DisplayName("Comprobar entrada valida de datos")
    public void ET1() {
        EventoTeatro evento = new EventoTeatro("Nuevo", "Desc");
        assertThrows(RuntimeException.class, () -> evento.agregarFuncion("titulo", "descripcion"));
    }
    
    @Test
    @DisplayName("Comprobar entrada de datos vacia")
    public void ET2() {
        EventoTeatro evento = new EventoTeatro("Nuevo", "Desc");
        
        Exception exception=assertThrows(IllegalArgumentException.class, () -> evento.agregarFuncion("", ""));
        assertEquals("Titulo/descripcion no pueden ser vacios",exception.getMessage());
    }
    
}

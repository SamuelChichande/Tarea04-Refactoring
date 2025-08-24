/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import Patron_Observer.Funcion;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Schic
 */
class EventoTest {

    EventoTest() {
        // Constructor vacío intencional: requerido por JUnit para instanciar la clase de prueba
    }

    @Test
    @DisplayName("Comprobar entrada valida de datos")
    void E() {
        Evento eventoTeatro = new EventoTeatro("Nuevo", "Desc");
        assertThrows(RuntimeException.class, () -> eventoTeatro.agregarFuncion("titulo", "descripcion"));

        Evento eventoMicroTeatro = new EventoMicroTeatro("Nuevo", "Desc");
        assertThrows(RuntimeException.class, () -> eventoMicroTeatro.agregarFuncion("titulo", "descripcion"));

        Evento eventoStandUp = new EventoStandUp("Nuevo", "Desc");
        assertThrows(RuntimeException.class, () -> eventoStandUp.agregarFuncion("titulo", "descripcion"));
    }

    /**
     * Test of getTitulo method, of class Evento.
     */
    @Test
    void testGetTitulo() {
        System.out.println("getTitulo");
        Evento instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Evento.
     */
    @Test
    void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Evento instance = null;
        instance.setTitulo(titulo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Evento.
     */
    @Test
    void testGetDescripcion() {
        System.out.println("getDescripcion");
        Evento instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Evento.
     */
    @Test
    void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Evento instance = null;
        instance.setDescripcion(descripcion);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFunciones method, of class Evento.
     */
    @Test
    void testGetFunciones() {
        System.out.println("getFunciones");
        Evento instance = null;
        List<Funcion> expResult = null;
        List<Funcion> result = instance.getFunciones();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarFuncion method, of class Evento.
     */
    @Test
    void testAgregarFuncion() {
        System.out.println("agregarFuncion");
        String titulo = "";
        String descripcion = "";
        Evento instance = null;
        instance.agregarFuncion(titulo, descripcion);
        fail("The test case is a prototype.");
    }

    public class EventoImpl extends Evento {

        public EventoImpl() {
            super("", "");
        }

        public void agregarFuncion(String titulo, String descripcion) {
        }
    }

}

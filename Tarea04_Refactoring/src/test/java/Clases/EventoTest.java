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
public class EventoTest {
    
    public EventoTest() {
    }
    
    
    @Test
    @DisplayName("Comprobar entrada valida de datos")
    public void E() {
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
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Evento instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Evento.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Evento instance = null;
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Evento.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Evento instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Evento.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Evento instance = null;
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFunciones method, of class Evento.
     */
    @Test
    public void testGetFunciones() {
        System.out.println("getFunciones");
        Evento instance = null;
        List<Funcion> expResult = null;
        List<Funcion> result = instance.getFunciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarFuncion method, of class Evento.
     */
    @Test
    public void testAgregarFuncion() {
        System.out.println("agregarFuncion");
        String titulo = "";
        String descripcion = "";
        Evento instance = null;
        instance.agregarFuncion(titulo, descripcion);
        // TODO review the generated test code and remove the default call to fail.
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

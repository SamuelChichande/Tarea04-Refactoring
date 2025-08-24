/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import Patron_Observer.Funcion;
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
class AdministradorSistemaTest {

    AdministradorSistemaTest() {
        // Constructor vacío intencional: requerido por el framework de pruebas
    }

    @BeforeAll
    void setUpClass() {
         // Método intencionalmente vacío, no requiere configuración global
    }

    @AfterAll
    static void tearDownClass() {
        // Método intencionalmente vacío, no requiere limpieza global
    }

    @BeforeEach
    void setUp() {
        // Método intencionalmente vacío, no se necesita inicialización previa
    }

    @AfterEach
    void tearDown() {
         // Método intencionalmente vacío, no se necesita limpieza posterior
    }

    @Test
    @DisplayName("Crear eventos con entradas null")
    void AS1() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Evento e = admin.crearEvento(null, null);

        assertNotNull(e);
    }

    @Test
    @DisplayName("Crear eventos con entradas vacias")
    void AS2() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Evento e = admin.crearEvento("", "");

        assertNotNull(e);
    }

    @Test
    @DisplayName("Crear un evento valido")
    void AS3() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Evento e = admin.crearEvento("Título", "Descripcion");

        assertNotNull(e);

        String nomEvent = e.getClass().getSimpleName();
        assertTrue(nomEvent.equals("EventoTeatro") || nomEvent.equals("EventoStandUp") || nomEvent.equals("EventoMicroTeatro"));
    }

    @Test
    @DisplayName("Crear una promocion con valores validos")
    void AS4() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Promocion p = admin.definirPromocion("Promo 2x1", 0.5f);

        assertNotNull(p);
        assertEquals("Promo 2x1", p.getDescripcion());
        assertEquals(0.5f, p.getDescuento());
    }

    
    
    @Test
    @DisplayName("modificar un evento que no existe")
    void AS5() {
        AdministradorSistema admin = new AdministradorSistema("admin", "admin@mail.com");
        Evento res = admin.modificarEvento(new EventoTeatro("NoExiste", "descripcion...."));
        assertNull(res);
    }

    @Test
    @DisplayName("Comprobar id que no coincide")
    void AS7() {
        AdministradorSistema admin = new AdministradorSistema("admin", "admin@mail.com");
        Funcion f = new Funcion(-1, new EventoTeatro("T", "D"), null, "ESPOL");
        assertNull(admin.configurarFuncion(f));
    }

    
    
    
    /**
     * Test of crearEvento method, of class AdministradorSistema.
     */
    @Test
    void testCrearEvento() {
        System.out.println("crearEvento");
        String titulo = "";
        String descripcion = "";
        AdministradorSistema instance = null;
        Evento expResult = null;
        Evento result = instance.crearEvento(titulo, descripcion);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEvento method, of class AdministradorSistema.
     */
    @Test
    void testModificarEvento() {
        System.out.println("modificarEvento");
        Evento evento = null;
        AdministradorSistema instance = null;
        Evento expResult = null;
        Evento result = instance.modificarEvento(evento);
        assertEquals(expResult, result); 
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarFuncion method, of class AdministradorSistema.
     */
    @Test
    void testConfigurarFuncion() {
        System.out.println("configurarFuncion");
        Funcion funcion = null;
        AdministradorSistema instance = null;
        Funcion expResult = null;
        Funcion result = instance.configurarFuncion(funcion);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of definirPromocion method, of class AdministradorSistema.
     */
    @Test
    void testDefinirPromocion() {
        System.out.println("definirPromocion");
        String descripcion = "";
        float descuento = 0.0F;
        AdministradorSistema instance = null;
        Promocion expResult = null;
        Promocion result = instance.definirPromocion(descripcion, descuento);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarPoliticaCancelamiento method, of class
     * AdministradorSistema.
     */
    @Test
    void testConfigurarPoliticaCancelamiento() {
        System.out.println("configurarPoliticaCancelamiento");
        PoliticaCancelacion politicaCancelacion = null;
        AdministradorSistema instance = null;
        instance.configurarPoliticaCancelamiento(politicaCancelacion);
        fail("The test case is a prototype.");
    }

}

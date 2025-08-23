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
public class SoporteClienteTest {
    
    public SoporteClienteTest() {
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
     * Test of escalarIncidente method, of class SoporteCliente.
     */
    @Test
    public void testEscalarIncidente() {
        System.out.println("escalarIncidente");
        Incidente incidente = null;
        SoporteCliente instance = null;
        instance.escalarIncidente(incidente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solucionarIncidente method, of class SoporteCliente.
     */
    @Test
    public void testSolucionarIncidente() {
        System.out.println("solucionarIncidente");
        Incidente incidente = null;
        SoporteCliente instance = null;
        instance.solucionarIncidente(incidente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    @Test
    @DisplayName("Comprobar que el metodo no falla ante una entrada valida")
    public void SC1() {
        AdministradorEvento ad = new AdministradorEvento("Admin", "a@mail.com");
        Incidente inc = new Incidente("Falla", "Pendiente", new Usuario("U", "u@mail.com"));

        assertDoesNotThrow(() -> ad.solucionarIncidente(inc));

    }
    
    @Test
    @DisplayName("Comprobar que el metodo no falla ante una entrada valida")
    public void SC2() {
        SoporteCliente sc = new SoporteCliente("Soporte","s@mail.com");
        Incidente inc = new Incidente("Caida","Pendiente", new Usuario("U","u@mail.com"));

        assertDoesNotThrow(() -> sc.escalarIncidente(inc));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP_435
 */
public class SalaDeCineTest {
    
   
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        String titulo = "FastF1";
        String genero = "Accion";
        String director = "Beto";
        Actor protagonista1 = new Actor("Vin Diesel", 30, "Chilena",'H');
        SalaDeCine sdc = new SalaDeCine();
        String expResult = "Pelicula agregada con exito";
        String result = sdc.agregarPelicula(titulo, genero, director, protagonista1);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testBuscarPelicula() {
        System.out.println("buscarPelicula");
        String titulo = "";
        SalaDeCine instance = new SalaDeCine();
        String expResult = "";
        String result = instance.buscarPelicula(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPeliculas method, of class SalaDeCine.
     */
    @Test
    public void testListarPeliculas() {
        System.out.println("listarPeliculas");
        SalaDeCine instance = new SalaDeCine();
        String expResult = "";
        String result = instance.listarPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerActricesMujeres method, of class SalaDeCine.
     */
    @Test
    public void testObtenerActricesMujeres() {
        System.out.println("obtenerActricesMujeres");
        SalaDeCine instance = new SalaDeCine();
        int expResult = 0;
        int result = instance.obtenerActricesMujeres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerActoresJovenes method, of class SalaDeCine.
     */
    @Test
    public void testObtenerActoresJovenes() {
        System.out.println("obtenerActoresJovenes");
        SalaDeCine instance = new SalaDeCine();
        int expResult = 0;
        int result = instance.obtenerActoresJovenes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

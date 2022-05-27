/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.testmavenproyecto;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class metodosProyectoMavenTest {
    
    public metodosProyectoMavenTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    

    /**
     * Test of getNombre method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        metodosProyectoMaven instance = new metodosProyectoMaven();
        String expResult = "jesus";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        metodosProyectoMaven instance = new metodosProyectoMaven();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getApellido method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testGetApellido() {
        System.out.println("getApellido");
        metodosProyectoMaven instance = new metodosProyectoMaven();
        String expResult = "valverde";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setApellido method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        metodosProyectoMaven instance = new metodosProyectoMaven();
        instance.setApellido(apellido);
        
    }

    /**
     * Test of getnIdentidad method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testGetnIdentidad() {
        System.out.println("getnIdentidad");
        metodosProyectoMaven instance = new metodosProyectoMaven();
        String expResult = "37482642F";
        String result = instance.getnIdentidad();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setnIdentidad method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testSetnIdentidad() {
        System.out.println("setnIdentidad");
        String nIdentidad = "";
        metodosProyectoMaven instance = new metodosProyectoMaven();
        instance.setnIdentidad(nIdentidad);
        
    }

    /**
     * Test of toString method, of class metodosProyectoMaven.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        metodosProyectoMaven instance = new metodosProyectoMaven();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}

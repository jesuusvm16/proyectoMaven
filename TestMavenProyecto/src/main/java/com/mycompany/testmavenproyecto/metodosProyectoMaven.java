/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmavenproyecto;

/**
 *
 * @author Administrador
 */
public class metodosProyectoMaven {
    public String nombre = "jesus";
    private String apellido = "valverde";
    private String nIdentidad = "37482642F";
    
    
    public metodosProyectoMaven() {
        String nombre = null;
        String apellido = null;
        String nIdentidad = null;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nIdentidad = nIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnIdentidad() {
        return nIdentidad;
    }

    public void setnIdentidad(String nIdentidad) {
        this.nIdentidad = nIdentidad;
    }

    @Override
    public String toString() {
        return "metodosProyectoMaven{" + "nombre=" + nombre + ", apellido=" + apellido + ", nIdentidad=" + nIdentidad + '}';
    }
    
    
}

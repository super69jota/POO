/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2;

/**
 *
 * @author Ramos Sanga
 */
class Persona {
    private String nombre;
    private int edad;

   
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }


    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}

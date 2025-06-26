/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2;

/**
 *
 * @author Ramos Sanga
 */
class Empleado extends Persona {
    private String cargo;

    public Empleado() {
        super();
        this.cargo = "Sin cargo";
    }

    public Empleado(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    public Empleado(String nombre, int edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
    }

    public String toString() {
        return "Empleado [" + super.toString() + ", cargo=" + cargo + "]";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2;

/**
 *
 * @author Ramos Sanga
 */
public class main {
    public static void main(String[] args) {
  
        Persona p1 = new Persona();
        Persona p2 = new Persona("Carlos");
        Persona p3 = new Persona("Ana", 28);
        
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado("Luis", "Gerente");
        Empleado e3 = new Empleado("Marta", 35, "Contadora");

      
        Enfermera n1 = new Enfermera();
        Enfermera n2 = new Enfermera("Rosa", "Mañana");
        Enfermera n3 = new Enfermera("Clara", 40, "Tarde");

     
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("Toyota");
        Vehiculo v3 = new Vehiculo("Honda", "Civic", 2022);

     
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}

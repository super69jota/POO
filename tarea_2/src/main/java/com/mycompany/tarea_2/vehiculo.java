/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_2;

/**
 *
 * @author Ramos Sanga
 */
class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo() {
        this.marca = "Genérica";
        this.modelo = "ModeloX";
        this.anio = 2000;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido";
        this.anio = 2000;
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + anio + "]";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Lenovo
 */
public class Enfermero {

    private String nombre;
    private String tipo;
    private double sueldoMensual;

    public Enfermero(String nom, String ti, double suel) {
        nombre = nom;
        tipo = ti;
        sueldoMensual = suel;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public void establecerSueldoMensual(double n) {
        sueldoMensual = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

}

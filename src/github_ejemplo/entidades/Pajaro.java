/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_ejemplo.entidades;

/**
 *
 * @author Renzo
 */
public class Pajaro {
    
    private String nombre;
    private int edad;
    private String raza;

    public Pajaro() {
    }

    public Pajaro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Pajaro{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }
        
    
}

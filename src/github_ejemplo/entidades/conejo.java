/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github_ejemplo.entidades;

/**
 *
 * @author familia
 */
public class conejo {
    private String nombre;
    private int edad;
    private String raza;

    public conejo() {
    }

    public conejo(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "conejo{" + "nombre=" + nombre + ", edad=" + edad + ", raza=" + raza + '}';
    }
    
}

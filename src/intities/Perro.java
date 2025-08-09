/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intities;

import interfaces.Domestico;

/**
 *
 * @author Escobo
 */
public class Perro extends Animal implements Domestico {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " esta jugando con la pelota.");
    }
}

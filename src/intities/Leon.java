/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intities;

import interfaces.Carnivoro;

/**
 *
 * @author Escobo
 */
public class Leon extends Animal implements Carnivoro {

    public Leon(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge fuerte.");
    }

    @Override
    public void cazar() {
        System.out.println(nombre + " esta cazando en la sabana.");
    }
}
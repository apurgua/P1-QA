package entities;

import interfaces.Carnivoro;

public class Leon extends Animal implements Carnivoro {

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ruge fuerte.");
    }

    @Override
    public void cazar() {
        System.out.println(nombre + " está cazando.");
    }
}

package entities;

import interfaces.Domestico;

public class Perro extends Animal implements Domestico {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega con la pelota.");
    }
}

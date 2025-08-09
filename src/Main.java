
import intities.Leon;
import intities.Perro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Escobo
 */
public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Mi perro");
        perro.hacerSonido();
        perro.jugar();

        Leon leon = new Leon("Leon africano");
        leon.hacerSonido();
        leon.cazar();
    }
}
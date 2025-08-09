package entities;

public abstract class Animal {

    protected String nombre;
    protected int edad;

    protected Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String presentarse() {
        return "Soy " + nombre + " y tengo " + edad + " años.";
    }
}

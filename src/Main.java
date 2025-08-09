
import entities.Perro;
import entities.Leon;
import repository.*;
import services.*;

public class Main {

    public static void main(String[] args) {
        // Repositorios info que esta en la momoria ram
        PerroRepository perroRepo = new InMemoryPerroRepository();
        LeonRepository leonRepo = new InMemoryLeonRepository();

        // Servicios
        PerroService perroService = new PerroService(perroRepo);
        LeonService leonService = new LeonService(leonRepo);

        // Entidades
        Perro perro = new Perro("Firulais", 3);
        Leon leon = new Leon("Simba", 5);

        // Registrar
        perroService.registrar(perro);
        leonService.registrar(leon);

        // Mostrar
        perroService.listar().forEach(p -> {
            System.out.println(p.presentarse());
            p.hacerSonido();
            p.jugar();
        });

        leonService.listar().forEach(l -> {
            System.out.println(l.presentarse());
            l.hacerSonido();
            l.cazar();
        });
    }
}

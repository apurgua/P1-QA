package services;

import java.util.List;
import entities.Perro;
import repository.PerroRepository;

public class PerroService {

    private final PerroRepository repo;

    public PerroService(PerroRepository repo) {
        this.repo = repo;
    }

    public Perro registrar(Perro perro) {
        return repo.save(perro);
    }

    public Perro obtenerPorNombre(String nombre) {
        return repo.findByNombre(nombre);
    }

    public List<Perro> listar() {
        return repo.findAll();
    }

    public boolean eliminar(String nombre) {
        return repo.deleteByNombre(nombre);
    }
}

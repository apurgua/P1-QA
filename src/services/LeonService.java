package services;

import java.util.List;
import entities.Leon;
import repository.LeonRepository;

public class LeonService {

    private final LeonRepository repo;

    public LeonService(LeonRepository repo) {
        this.repo = repo;
    }

    public Leon registrar(Leon leon) {
        return repo.save(leon);
    }

    public Leon obtenerPorNombre(String nombre) {
        return repo.findByNombre(nombre);
    }

    public List<Leon> listar() {
        return repo.findAll();
    }

    public boolean eliminar(String nombre) {
        return repo.deleteByNombre(nombre);
    }
}

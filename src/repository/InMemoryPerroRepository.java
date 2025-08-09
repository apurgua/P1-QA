package repository;

import java.util.*;
import entities.Perro;

public class InMemoryPerroRepository implements PerroRepository {

    private final Map<String, Perro> store = new HashMap<>();

    @Override
    public Perro save(Perro perro) {
        store.put(perro.getNombre(), perro);
        return perro;
    }

    @Override
    public Perro findByNombre(String nombre) {
        return store.get(nombre);
    }

    @Override
    public List<Perro> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public boolean deleteByNombre(String nombre) {
        return store.remove(nombre) != null;
    }
}

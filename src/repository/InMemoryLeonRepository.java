package repository;

import java.util.*;
import entities.Leon;

public class InMemoryLeonRepository implements LeonRepository {

    private final Map<String, Leon> store = new HashMap<>();

    @Override
    public Leon save(Leon leon) {
        store.put(leon.getNombre(), leon);
        return leon;
    }

    @Override
    public Leon findByNombre(String nombre) {
        return store.get(nombre);
    }

    @Override
    public List<Leon> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public boolean deleteByNombre(String nombre) {
        return store.remove(nombre) != null;
    }
}

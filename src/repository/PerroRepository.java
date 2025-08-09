package repository;

import java.util.List;
import entities.Perro;

public interface PerroRepository {

    Perro save(Perro perro);

    Perro findByNombre(String nombre);

    List<Perro> findAll();

    boolean deleteByNombre(String nombre);
}

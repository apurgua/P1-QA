package repository;

import java.util.List;
import entities.Leon;

public interface LeonRepository {

    Leon save(Leon leon);

    Leon findByNombre(String nombre);

    List<Leon> findAll();

    boolean deleteByNombre(String nombre);
}

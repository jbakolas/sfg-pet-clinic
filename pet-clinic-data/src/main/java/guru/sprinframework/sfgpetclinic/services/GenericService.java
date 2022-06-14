package guru.sprinframework.sfgpetclinic.services;

import java.util.Set;

public interface GenericService<T> {

    T save(T t);

    T findById(Long id);

    Set<T> findAll();

}

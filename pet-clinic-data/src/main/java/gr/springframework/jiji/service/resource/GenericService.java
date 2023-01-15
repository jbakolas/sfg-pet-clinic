package gr.springframework.jiji.service.resource;

import java.util.Set;

public interface GenericService<T, ID> {
    T save(T t);
    T findById(ID id);
    Set<T> findAll();
}

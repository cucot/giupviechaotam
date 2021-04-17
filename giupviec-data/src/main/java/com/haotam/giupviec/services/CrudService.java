package com.haotam.giupviec.services;

import java.util.Set;

public interface CrudService <T, ID>{

    T save(T target);

    void delete(T target);

    void deleteById(ID id);

    T findById(ID id);

    Set<T> findAll();
}

package com.haotam.giupviec.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    T findByID(ID id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(ID id, T type) {
        map.put(id, type);
        return type;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T type) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(type));
    }

}

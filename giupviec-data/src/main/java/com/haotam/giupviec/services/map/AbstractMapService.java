package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.BaseEntity;
import com.haotam.giupviec.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {
    protected Map<Long, T> map = new HashMap<>();

    @Override
    public T save(T target) {
        map.put(target.getId(), target);
        return target;
    }

    @Override
    public void delete(T target) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(target));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }
}

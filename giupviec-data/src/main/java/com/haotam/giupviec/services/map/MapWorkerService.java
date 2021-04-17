package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Worker;
import com.haotam.giupviec.services.CrudService;

import java.util.Set;

public class MapWorkerService extends AbstractMapService<Worker, Long> implements CrudService<Worker, Long> {

    @Override
    public Worker save(Worker worker) {
        return super.save(worker.getId(), worker);
    }

    @Override
    public Worker findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(Worker worker) {
        super.delete(worker);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Worker> findAll() {
        return super.findAll();
    }
}

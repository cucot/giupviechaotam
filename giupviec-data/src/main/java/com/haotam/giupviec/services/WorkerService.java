package com.haotam.giupviec.services;

import com.haotam.giupviec.model.Worker;

import java.util.Set;

public interface WorkerService {

    Worker save(Worker worker);

    Set<Worker> findAll();

    Worker findById(Long id);
}

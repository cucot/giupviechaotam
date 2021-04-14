package com.haotam.giupviec.services;

import com.haotam.giupviec.model.Worker;
import com.haotam.giupviec.repositories.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Transactional
public class EmployeeService {
    private final WorkerRepository workerRepository;

    public EmployeeService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public void doSomething() {
        List<Worker> workers = workerRepository.findAll();
    }
}

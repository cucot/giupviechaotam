package com.haotam.giupviec.demo;

import com.haotam.giupviec.constants.Test;
import com.haotam.giupviec.services.WorkerService;

public class ConstructorBasedDI {

    private WorkerService workerService;

    public ConstructorBasedDI(WorkerService workerService) {
        this.workerService = workerService;
    }

    public String sayHello() {
        return workerService.hello();
    }
}

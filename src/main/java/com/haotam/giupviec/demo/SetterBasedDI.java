package com.haotam.giupviec.demo;

import com.haotam.giupviec.services.WorkerService;

public class SetterBasedDI {

    private WorkerService workerService;
    public void setWorkerService(WorkerService workerService) {
        this.workerService = workerService;
    }

    public String greeting() {
        return workerService.hello();
    }
}

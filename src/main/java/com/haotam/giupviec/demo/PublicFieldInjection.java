package com.haotam.giupviec.demo;

import com.haotam.giupviec.services.WorkerService;

public class PublicFieldInjection {

    public WorkerService workerService;

    public String greeting() {
        return workerService.hello();
    }
}

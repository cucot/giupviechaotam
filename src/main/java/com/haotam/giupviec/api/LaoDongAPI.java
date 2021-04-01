package com.haotam.giupviec.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haotam.giupviec.api.request.DataTableRequest;
import com.haotam.giupviec.api.response.DataTableResponse;
import com.haotam.giupviec.entity.Worker;
import com.haotam.giupviec.service.WorkerService;

@RestController
@RequestMapping("/api")
public class LaoDongAPI {

    @Autowired
    private WorkerService workerService;
    
    @CrossOrigin
    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public DataTableResponse<Worker> getAll(@ModelAttribute DataTableRequest dataTableRequest) {
        return workerService.getWorkers(dataTableRequest);
    }

}

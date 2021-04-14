package com.haotam.giupviec.services;

import com.haotam.giupviec.api.request.DataTableRequest;
import com.haotam.giupviec.api.response.DataTableResponse;
import com.haotam.giupviec.model.Worker;
import com.haotam.giupviec.repositories.WorkerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
//@Transactional
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public DataTableResponse<Worker> getWorkers(DataTableRequest dataTableRequest) {
        int startPage = dataTableRequest.getStart() / dataTableRequest.getLength();
        Pageable pageable = PageRequest.of(startPage, dataTableRequest.getLength());
        Page<Worker> responsePage = workerRepository.findAll(pageable);
        DataTableResponse<Worker> dataTableResponse = new DataTableResponse<>();
        dataTableResponse.setRecordsTotal(responsePage.getTotalElements());
        dataTableResponse.setRecordsFiltered(responsePage.getTotalElements());
        dataTableResponse.setData(responsePage.getContent());
        dataTableResponse.setDraw(dataTableRequest.getDraw());
        return dataTableResponse;
    }
}

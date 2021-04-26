package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Worker;
import com.haotam.giupviec.services.WorkerService;
import org.springframework.stereotype.Service;

@Service
public class MapWorkerService extends AbstractMapService<Worker, Long> implements WorkerService {
}

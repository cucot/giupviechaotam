package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Contract;
import com.haotam.giupviec.services.ContractService;
import org.springframework.stereotype.Service;

@Service
public class MapContractService extends AbstractMapService<Contract, Long> implements ContractService {
}
package com.haotam.giupviec.services;

import com.haotam.giupviec.model.Contract;

import java.util.Set;

public interface ContractService {

    Contract save(Contract contract);

    Set<Contract> findAll();

    Contract findById(Long id);
}

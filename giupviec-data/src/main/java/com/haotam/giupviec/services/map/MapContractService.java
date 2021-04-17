package com.haotam.giupviec.services.map;

import com.haotam.giupviec.model.Contract;
import com.haotam.giupviec.services.CrudService;

import java.util.Set;

public class MapContractService extends AbstractMapService<Contract, Long> implements CrudService<Contract, Long> {

    @Override
    public Contract save(Contract target) {
        return super.save(target.getId(), target);
    }

    @Override
    public Contract findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public void delete(Contract contract) {
        super.delete(contract);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Contract> findAll() {
        return super.findAll();
    }
}
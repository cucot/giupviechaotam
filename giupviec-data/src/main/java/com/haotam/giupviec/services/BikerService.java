package com.haotam.giupviec.services;

import com.haotam.giupviec.model.Biker;

import java.util.Set;

public interface BikerService {

    Biker save(Biker biker);

    Set<Biker> findAll();

    Biker findById(Long id);

}

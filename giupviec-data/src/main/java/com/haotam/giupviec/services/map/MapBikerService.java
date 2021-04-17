package com.haotam.giupviec.services.map;

import java.util.Set;

import com.haotam.giupviec.model.Biker;
import com.haotam.giupviec.services.CrudService;

public class MapBikerService extends AbstractMapService <Biker, Long> implements CrudService<Biker, Long> {

     @Override
     public Biker save(Biker target) {
         return super.save(target.getId(), target);
     }

     @Override
     public void delete(Biker biker) {
         super.delete(biker);
     }

     @Override
     public void deleteById(Long id) {
         super.deleteById(id);
     }

     @Override
     public Set<Biker> findAll() {
         return super.findAll();
     }

     @Override
     public Biker findById(Long id) {
         return super.findByID(id);
     }
    
}

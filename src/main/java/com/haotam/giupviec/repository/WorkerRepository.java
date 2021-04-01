package com.haotam.giupviec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haotam.giupviec.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {   
}

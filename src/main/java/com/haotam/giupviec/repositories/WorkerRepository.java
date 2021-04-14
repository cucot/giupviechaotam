package com.haotam.giupviec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haotam.giupviec.model.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}

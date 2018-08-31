package com.example.demo.repository;

import com.example.demo.domain.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<Task,Long>{
    @Override
    List<Task> findAll();
    Task findById(Long id);
    List<Task> findByUserId(Long id);
}

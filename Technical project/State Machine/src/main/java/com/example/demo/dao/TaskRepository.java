package com.example.demo.dao;

import com.example.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // all crud database methods
    public Task findTaskById(Long taskId);
}

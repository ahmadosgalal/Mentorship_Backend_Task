package com.example.demo.dao;

import com.example.demo.model.Task;

import java.awt.*;
import java.util.UUID;
import java.util.List;

public interface TaskDao {
    int insertTask(UUID id, Task task);

    default int insertTask(Task task)
    {
        UUID id = UUID.randomUUID();
        return insertTask(id, task);
    }

    List<Task> selectAllTasks();
}

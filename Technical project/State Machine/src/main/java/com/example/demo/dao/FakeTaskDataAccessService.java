package com.example.demo.dao;

import com.example.demo.model.Task;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakeTaskDataAccessService implements TaskDao{

    private static List<Task> DB = new ArrayList<>();

    @Override
    public int insertTask(UUID id, Task task) {
        DB.add(new Task(id, task.getTitle(), task.getState()));
        return 1;
    }

    @Override
    public List<Task> selectAllTasks() {
        return DB;
    }


}

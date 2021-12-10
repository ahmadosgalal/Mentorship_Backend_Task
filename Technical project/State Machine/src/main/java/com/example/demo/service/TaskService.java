package com.example.demo.service;

import com.example.demo.dao.TaskDao;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskDao taskDao;

    @Autowired
    public TaskService(@Qualifier("fakeDao") TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public int addTask(Task task) {
        return taskDao.insertTask(task);
    }

    public List<Task> getAllTasks(){
        return taskDao.selectAllTasks();
    }

}

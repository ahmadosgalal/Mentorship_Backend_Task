package com.example.demo.service;

import com.example.demo.dao.TaskRepository;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskDao;


    public List<Task> addTask(Task task) {
        taskDao.save(task);
        return taskDao.findAll();
    }

    public List<Task> getAllTasks(){
        return taskDao.findAll();
    }

    public List<Task> removeTask(Long id) {
        if(taskDao.existsById(id))
            taskDao.deleteById(id);
        return taskDao.findAll();
    }

    public Task updateTask(Long id, Task task) {

        if(taskDao.existsById(id)) {
            Task updatedTask = taskDao.findTaskById(id);
            updatedTask.setState(task.getState());
            return taskDao.save(updatedTask);
        }
        return null;
    }

    public Optional<Task> getTaskByID(Long id) {
        Optional<Task> task = taskDao.findById(id);
        return task;
    }
}

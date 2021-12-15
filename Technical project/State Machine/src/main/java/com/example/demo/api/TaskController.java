package com.example.demo.api;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Optional;
import java.util.List;


@RequestMapping("/api/v1/task")
@RestController
public class TaskController {


    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public List<Task> addTask(@RequestBody Task task)
    {
        return taskService.addTask(task);
    }

    @GetMapping(path = "{id}")
    public Optional<Task> getTaskById(@PathVariable("id") Long id)
    {
        return taskService.getTaskByID(id);
    }


    @DeleteMapping(path = "{id}")
    public List<Task> removeTask(@PathVariable("id") Long id)
    {
        return taskService.removeTask(id);
    }

    @PutMapping(path = "{id}")
    public Task updateTask(@PathVariable("id") Long id,@RequestBody Task task)
    {
        return taskService.updateTask(id, task);
    }
}

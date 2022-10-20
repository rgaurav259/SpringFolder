package com.example.springdatamongoAtlas.Service;

import com.example.springdatamongoAtlas.Model.Task;
import com.example.springdatamongoAtlas.Repository.TaskRepository;

import java.util.List;

public interface TaskService {

    Task  addTask(Task task);

    List<Task> findAllTasks();

    Task getTasksById(String taskId);

    List<Task> getTaskBySeverity(Integer severity);

    List<Task> getTaskByAssignee(String assignee);

    Task updateTask(Task taskRequest);

    String deleteTask(String taskId);
}

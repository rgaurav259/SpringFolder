package com.example.springdatamongoAtlas.Service;

import com.example.springdatamongoAtlas.Model.Task;
import com.example.springdatamongoAtlas.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskRepository taskRepository;



    @Override
    public Task addTask(Task task) {
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTasksById(String taskId) {
        return taskRepository.findById(taskId).get();
    }

    @Override
    public List<Task> getTaskBySeverity(Integer severity) {
            return taskRepository.findBySeverity(severity);
    }


    //using query met hod
    @Override
    public List<Task> getTaskByAssignee(String assignee) {
        return taskRepository.findByTskAssignee(assignee);
    }

    @Override
    public Task updateTask(Task taskRequest) {

        //we can use taskId as well instead of taskrequest param
        //get the existing documnetn from db
        //populate new value request to exixting object/entities/document

        Task existingTask = taskRepository.findById(taskRequest.getTaskId()).get();
        existingTask.setDescription(taskRequest.getDescription());
        existingTask.setSeverity(taskRequest.getSeverity());
        existingTask.setAssignee(taskRequest.getAssignee());
        existingTask.setStoryPoint(taskRequest.getStoryPoint());

        return taskRepository.save(existingTask);
    }

    @Override
    public String deleteTask(String taskId) {
         taskRepository.deleteById(taskId);
         return  taskId + "task deleted successfully from db";
    }

    //delete task



}

package edu.eci.apiresttaks.service;

import edu.eci.apiresttaks.data.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService{

    private final HashMap<String,Task> tasks = new HashMap<>();

    @Override
    public Task create(Task task) {
        String newId = generateId();
        task.setId(newId);
        tasks.put(newId,task);
        return task;
    }

    @Override
    public Task findById(String id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> all() {
        ArrayList<Task> tasksList = new ArrayList<>(tasks.values());
        return tasksList;
    }

    @Override
    public void deleteById(String id) {
        tasks.remove(id);
    }

    @Override
    public Task update(Task task, String id) {
        task.setId(id);
        tasks.put(id,task);
        return task;
    }
    private String generateId(){
        return String.valueOf(tasks.size()+1);
    }
}

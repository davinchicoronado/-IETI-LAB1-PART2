package edu.eci.apiresttaks.controller;

import edu.eci.apiresttaks.data.Task;
import edu.eci.apiresttaks.dto.TaskDto;
import edu.eci.apiresttaks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/task" )
public class TaskController {

    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService){
        this.taskService=taskService;
    }
    @GetMapping
    public ResponseEntity<List<Task>> all() {
        return new ResponseEntity<>(taskService.all(), HttpStatus.ACCEPTED);
    }
    @GetMapping( "/{id}" )
    public ResponseEntity<Task> findById( @PathVariable String id )
    {
        return new ResponseEntity<>(taskService.findById(id),HttpStatus.ACCEPTED);
    }
    @PostMapping
    public ResponseEntity<Task> create( @RequestBody TaskDto taskDto)
    {
        Task user = new Task(taskDto);
        return new ResponseEntity<>(taskService.create(user),HttpStatus.CREATED);
    }
    @PutMapping( "/{id}" )
    public ResponseEntity<Task> update( @RequestBody TaskDto taskDto, @PathVariable String id )
    {
        Task user = new Task(taskDto);
        return new ResponseEntity<>(taskService.update(user,id),HttpStatus.ACCEPTED);
    }
    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        taskService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}

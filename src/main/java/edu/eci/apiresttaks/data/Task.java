package edu.eci.apiresttaks.data;

import edu.eci.apiresttaks.Status;
import edu.eci.apiresttaks.dto.TaskDto;

import java.util.Date;

public class Task {
    private String id;
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private Date dueDate;
    private Date created;

    public Task(TaskDto taskDto){
        this.name=taskDto.getName();
        this.description=taskDto.getDescription();
        this.status=taskDto.getStatus();
        this.assignedTo=taskDto.getAssignedTo();
        this.dueDate=taskDto.getDueDate();
        this.created=taskDto.getCreated();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}

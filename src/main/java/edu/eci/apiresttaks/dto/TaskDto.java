package edu.eci.apiresttaks.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.eci.apiresttaks.Status;

import java.util.Date;

public class TaskDto {
    private String name;
    private String description;
    private String assignedTo;
    private Status status;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dueDate;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date created;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Status getStatus() {
        return status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}

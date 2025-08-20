package com.dojo.tdd.Taskmanager.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Task {
    private Long Id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Task(Long id, String title, String description, boolean completed) {
        this.Id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.createdAt = LocalDateTime.now();
    }

    public Task(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or empty");

        }

        this.title = title;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }
}

package com.dojo.tdd.Taskmanager;

import com.dojo.tdd.Taskmanager.model.Task;
import jakarta.validation.constraints.AssertFalse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TaskTest {
    // This class is intended for testing the Task functionality in the Task Manager application.
    // It will contain test methods to validate the behavior of Task-related features.

    // Example test method (to be implemented):
     @Test
     public void testTaskCreation() {
        String title = "Sample Task";
        Task task = new Task(title);
        assertEquals(title, task.getTitle());
        assertFalse(task.isCompleted());
    }

    @Test
    public void testTaskCreationWithNullTitleThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task(null);
        });
        assertEquals("Title cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testTaskCreationWithEmptyTitleThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task("");
        });
        assertEquals("Title cannot be null or empty", exception.getMessage());
    }


}

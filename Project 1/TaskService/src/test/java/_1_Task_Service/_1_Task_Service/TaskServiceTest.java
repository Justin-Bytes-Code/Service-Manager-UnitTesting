package _1_Task_Service._1_Task_Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Justin Perez
 * 
 * Test for TaskService.java
 * Check if we can add, delete, update tasks
 * NOTE: I also didn't add a random function to the task ID as it was giving issues with testing on this assignment
 * going on I will be sure to add IDS with random that work with test
 */

public class TaskServiceTest {

    private TaskService taskService;
    
    //Runs before every test (Created so I don't have to write this multiple times)
    @BeforeEach 
    public void setup() {
        taskService = new TaskService();
    }

    //Adds a task
    @Test 
    public void testAddTask() {
        Task task = new Task("001", "Write", "Write more tests.");
        assertTrue(taskService.addTask(task));
    }

    // Checks to see if you can't add 2 IDS
    @Test 
    public void testAddDuplicateTaskFails() {
        Task task1 = new Task("001", "Test", "Make tests");
        Task task2 = new Task("001", "Repeat", "Same ID");
        taskService.addTask(task1);
        assertFalse(taskService.addTask(task2)); // Should not allow same ID
    }

    //Deletes a task
    @Test 
    public void testDeleteTask() {
        Task task = new Task("001", "Clean", "Clean desk.");
        taskService.addTask(task);
        assertTrue(taskService.deleteTask("001"));
    }

    //Update information
    @Test 
    public void testUpdateTask() {
        Task task = new Task("001", "Old", "Old description");
        taskService.addTask(task);
        assertTrue(taskService.updateTask("001", "New", "New description"));
        assertEquals("New", task.getName());
        assertEquals("New description", task.getDescription());
    }

    //Tries to update a task that isn't there
    @Test 
    public void testUpdateNonExistentTask() {
        assertFalse(taskService.updateTask("999", "Name", "Description"));
    }
}

package _1_Task_Service._1_Task_Service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/** Justin Perez
 * 
 * Test for Task.java
 * Check that task info works as expected
 * 
 */

public class TaskTest {

	// Test for correct Information 
    @Test 
    public void testCreateValidTask() {
        Task task = new Task("123", "Task", "Finished The Task.");
        assertEquals("123", task.getTaskID());
        assertEquals("Task", task.getName());
        assertEquals("Finished The Task.", task.getDescription());
    }

    //Validates name
    @Test 
    public void testInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task("123", "Thisnameiswaytoextreamlylonginordertofit", "Good description");
        });
        assertEquals("Name must be 20 chars or less and not null.", exception.getMessage());
    }

    //Change name and description
    @Test
    public void testSettersWork() {
        Task task = new Task("001", "Plan", "Plan things");
        task.setName("Write");
        task.setDescription("Write unit test code.");
        assertEquals("Write", task.getName());
        assertEquals("Write unit test code.", task.getDescription());
    }
}

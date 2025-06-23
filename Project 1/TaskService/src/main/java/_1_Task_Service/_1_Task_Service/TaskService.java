package _1_Task_Service._1_Task_Service;

import java.util.HashMap;
import java.util.Map;

/** Justin Perez
 * 
 * TaskService.java - Lets us manage many tasks
 * Can add, update, delete tasks by ID
 * 
 */

public class TaskService {

    // Save all to a hashmap/dictionary . This is for the contact ID
    private Map<String, Task> tasks = new HashMap<>();

    // Add a task if taskID is not used to ensure it doesn't break. 
    public boolean addTask(Task task) {
        if (task == null || task.getTaskID() == null || tasks.containsKey(task.getTaskID())) {
            return false; //ID already exists
        }
        tasks.put(task.getTaskID(), task);
        return true;
    }

    // Delete task by ID
    public boolean deleteTask(String taskID) {
        if (tasks.containsKey(taskID)) {
            tasks.remove(taskID);
            return true;
        }
        return false;
    }

    // Update name and description
    public boolean updateTask(String taskID, String name, String description) {
        Task task = tasks.get(taskID);
        if (task == null) {
            return false; // ID not found
        }
        try {
            if (name != null) task.setName(name);
            if (description != null) task.setDescription(description);
        } catch (IllegalArgumentException e) {
            return false; // Something was invalid
        }
        return true;
    }
}

package _1_Task_Service._1_Task_Service;

/** Justin Perez
 * 
 * Task.java - Holds all the task data
 * Used by TaskService to make, update, and get task info
 * 
 */

public class Task {

    // Task Info
    private final String taskID; // Task ID is final = not allowed to change
    private String name;
    private String description;

    // Constructor
    public Task(String taskID, String name, String description) {
        // Validate each field 
    	//TODO: Make a random number. 
        if (taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Task ID must be 10 chars or less and not null.");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Name must be 20 chars or less and not null.");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description must be 50 chars or less and not null.");
        }

        // Saves the info
        this.taskID = taskID;
        this.name = name;
        this.description = description;
    }

    // Getters
    public String getTaskID() {
        return taskID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Name must be 20 chars or less and not null.");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description must be 50 chars or less and not null.");
        }
        this.description = description;
    }
}

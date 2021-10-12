package Task;

public class Task {


    private Date dueDate;
    private Priority priority;
    private String description;
    private Category category;
    private static int count = 0;
    private int taskID = 0;

    public Task(Date dueDate, Priority priority, String description, Category category) {
        this.dueDate = dueDate;
        this.priority = priority;
        this.description = description;
        this.category = category;
        taskID = count++;
    }

    public Task(Date dueDate) {
        this.dueDate = dueDate;
        taskID = count++;
    }

    public int getTaskID() {
        return taskID;
    }

    @Override
    public String toString() {
        return String.format("| %03d | %10s | %-7S | %-5S | %-30s |",
                taskID, dueDate, priority, category, description);
    }
   /* @Override
    public String toString() {
        return "Task{" +
                "dueDate=" + dueDate +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", taskID=" + taskID +
                '}';
    }*/

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}

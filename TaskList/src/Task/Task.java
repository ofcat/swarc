package Task;

public class Task {


    private Date dueDate;
    private Priority priority;
    private String description;
    private Category category;

    public Task(Date dueDate, Priority priority, String description, Category category) {
        this.dueDate = dueDate;
        this.priority = priority;
        this.description = description;
        this.category = category;
    }

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

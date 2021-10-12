package TaskManager;

import Task.*;

import java.util.List;

public interface TaskInterface {
    public List<Task> filter();

    public void delete(int ID);

    public boolean insert(Task tasks);

    public void updatePriority(int ID, Priority priority);

    public void updateCategory(int ID, Category cat);

    public void updateDate(int ID, Date date);

    public List<Task> allTasks();


}

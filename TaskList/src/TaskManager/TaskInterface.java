package TaskManager;

import Task.*;

import java.util.List;

public interface TaskInterface {


    List<Task> filter();

    void delete(int index);

    boolean insert(Task tasks);

    void updatePriority(int index, Priority priority);

    void updateCategory(int index, Category cat);

    void updateDate(int index, Date date);

    List<Task> allTasks();


}

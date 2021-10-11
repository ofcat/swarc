import Task.Task;

import java.util.List;

public interface TaskInterface {
    public List<Task> filter();
    public List<Task> delete();
    public List<Task> insert();
    public void printAll();
    public void printChosen(); //choose what to print by: category, priority, date


}

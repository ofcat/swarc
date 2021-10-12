package TaskManager;

import Task.*;

import java.util.LinkedList;
import java.util.List;

public class TaskPlanner implements TaskInterface {

    private List<Task> tasks = new LinkedList<Task>();


    @Override
    public List<Task> filter() {

        return null;
    }

    @Override
    public void delete(int ID) { //doesnt work
        tasks.remove(ID);
    }


    @Override
    public boolean insert(Task t) {
        return tasks.add(t);
    }

    @Override
    public void updatePriority(int ID, Priority priority) { //doesnt work
        tasks.get(ID).setPriority(priority);
    }

    @Override
    public void updateCategory(int ID, Category cat) {//doesnt work
        tasks.get(ID).setCategory(cat);
    }

    @Override
    public void updateDate(int ID, Date date) {//doesnt work
        tasks.get(ID).setDueDate(date);
    }

    @Override
    public List<Task> allTasks() {
        return new LinkedList<Task>(tasks);
    }
}

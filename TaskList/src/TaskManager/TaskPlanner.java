package TaskManager;

import Task.*;
import Utility.Matcher;

import java.util.LinkedList;
import java.util.List;

//dont import util*, it wil clash with my Date class

public class TaskPlanner implements TaskInterface {

    private List<Task> tasks = new LinkedList<>();
    Matcher<Task> taskMatcher;


    @Override
    public List<Task> filter() {
        LinkedList<Task> filtered = new LinkedList<>();

        for (Task t : tasks) {
            if (taskMatcher.matches(t))
                filtered.add(t);
        }
        return filtered;
    }

    public void setTaskFilter(Matcher<Task> filter) {
        this.taskMatcher = filter;
    }

    @Override
    public void delete(int index) { //doesnt work
        tasks.remove(index);
    }

    @Override
    public boolean insert(Task t) {
        return tasks.add(t);
    }

    @Override
    public void updatePriority(int index, Priority priority) { //doesnt work
        tasks.get(index).setPriority(priority);
    }

    @Override
    public void updateCategory(int index, Category cat) {//doesnt work
        tasks.get(index).setCategory(cat);
    }

    @Override
    public void updateDate(int index, Date date) {//doesnt work
        tasks.get(index).setDueDate(date);
    }

    @Override
    public List<Task> allTasks() {
        return new LinkedList<>(tasks);
    }
}

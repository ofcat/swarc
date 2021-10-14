package Utility;

import Task.*;


public class LPriorityMatcher implements Matcher<Task>{
    @Override
    public boolean matches(Task task) {
        return task.getPriority() == Priority.LOW;
    }
}

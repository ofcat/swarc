package Utility;

import Task.*;

public class WPriorityMatcher implements Matcher<Task>{

    @Override
    public boolean matches(Task task) {
        return task.getPriority() == Priority.WAITING;
    }
}

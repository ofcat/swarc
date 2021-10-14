package Utility;

import Task.*;

public class HPriorityMatcher implements Matcher<Task> {

    @Override
    public boolean matches(Task task) {
        return task.getPriority() == Priority.HIGH;
    }
}

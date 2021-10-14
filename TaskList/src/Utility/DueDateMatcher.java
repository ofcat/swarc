package Utility;

import Task.*;

public class DueDateMatcher implements Matcher<Task> {
    private Date dueDate;

    public DueDateMatcher(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean matches(Task task) {
        return task.getDueDate().makeInt() == dueDate.makeInt();
    }
}

package App;

import Task.*;
import TaskManager.*;
import Utility.*;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        //initialize planner with sample values
        TaskPlanner planner = initTaskPlanner();

        //print out all tasks
        print(planner.allTasks());

        //filter out tasks due 05.12.2021
        planner.setTaskFilter(new DueDateMatcher(new Date(5, 12, 2021)));
        print(planner.filter());

        //filter out tasks with high priority
        planner.setTaskFilter(new HPriorityMatcher());
        print(planner.filter());

        //print the whole list
        print(planner.allTasks());

        //update task's due date (update by element index)
        planner.updateDate(0, new Date(10, 11, 2021));
        print(planner.allTasks());

        //delete task (delete by element index)
        planner.delete(5);
        print(planner.allTasks());

        //initially, i wanted to use taskID to perform the functions,
        // but i wasn't able to find an effective solution to use it
    }

    public static TaskPlanner initTaskPlanner() {
        TaskPlanner planner = new TaskPlanner();

        Task t;

        t = new Task(new Date(5, 11, 2021), Priority.WAITING, "Do math research!", Category.WORK);
        planner.insert(t);

        t = new Task(new Date(21, 10, 2021), Priority.LOW, "Do your groceries", Category.OTHER);
        planner.insert(t);

        t = new Task(new Date(18, 8, 2021), Priority.WAITING, "Update databases", Category.WORK);
        planner.insert(t);

        t = new Task(new Date(28, 10, 2021), Priority.HIGH, "Finish webdev homework", Category.STUDY);
        planner.insert(t);

        t = new Task(new Date(5, 12, 2021), Priority.LOW, "Do test preparation (maths)", Category.STUDY);
        planner.insert(t);

        t = new Task(new Date(5, 12, 2021), Priority.HIGH, "Iron your pants", Category.OTHER);
        planner.insert(t);

        t = new Task(new Date(5, 12, 2021), Priority.HIGH, "Get coffee on the way to work", Category.WORK);
        planner.insert(t);

        return planner;
    }

    public static void print(List<Task> list) {
        int count = 0;
        System.out.println("-Ind-TaskID---Due Date--Priority--Category---------Description-------------");
        for (Task task : list) {
            System.out.println("| " + count + " " + task);
            count++;
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
    }

}

package App;

import Task.*;
import TaskManager.*;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        //initialize planner with sample values
        TaskPlanner planner = initTaskPlanner();

        //print the whole list
        printList(planner.allTasks());

        //remove Task with taskID = 0
        planner.delete(0);

        System.out.println();
        System.out.println();
        printList(planner.allTasks());

        //both of them dont work
        //update task with taskID = 1 to HIGH priority
        //planner.updatePriority(1, Priority.LOW);

        // update date for task
       // planner.updateDate(2, new Date(1, 11, 2021));
        printList(planner.allTasks());
    }

    public static TaskPlanner initTaskPlanner() {
        TaskPlanner planner = new TaskPlanner();

        Task t = new Task(new Date(2, 3, 2000));
        t.setPriority(Priority.HIGH);
        t.setCategory(Category.WORK);
        t.setDescription("Do swarc homework!");
        planner.insert(t);

        t = new Task(new Date(13, 7, 2021), Priority.WAITING, "Do math research!", Category.STUDY);
        planner.insert(t);

        t = new Task(new Date(21, 10, 2021), Priority.LOW, "Do your groceries", Category.OTHER);
        planner.insert(t);

        return planner;
    }

    public static <T> void printList(List<T> list) {
        System.out.println("TaskID---Due Date---Priority--Category---------Description------------");
        for (T t : list) {
            System.out.println(t);
        }
    }


}

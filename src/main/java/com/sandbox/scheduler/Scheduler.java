package main.java.com.sandbox.scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.java.com.sandbox.scheduler.model.Task;

public class Scheduler {

	public static List<Task> priorityTask = new ArrayList<Task>();
	
	public static void scheduleTask(Task t) {
		priorityTask.add(t);
		
		Collections.sort(priorityTask, new Comparator<Task>() {
			
			// first comparision the urgency attribute 
			@Override
			public int compare (Task t1, Task t2) {
				int urgCmp = Integer.toString(t1.urgency).compareTo(Integer.toString(t2.urgency));
				if (urgCmp != 0) {
					return urgCmp;
				}
			
				// second comparision  the category  attribute 
				int catCmp = Integer.toString(t1.category.getValue()).compareTo(Integer.toString(t2.category.getValue()));
				if (catCmp != 0) {
					return catCmp;
				}
				
				// third comparision timestamp attribute
				return t1.timeStamp.compareTo(t2.timeStamp);
			}
				
			});
	
	}
	
	
// print the priority tasks
public static void printSchedule() {
	priorityTask.forEach(System.out::println);
}
}
	
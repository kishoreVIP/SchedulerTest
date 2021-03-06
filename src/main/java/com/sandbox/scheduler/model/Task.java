package main.java.com.sandbox.scheduler.model;

import java.time.LocalDateTime;

public class Task {
	
	public int urgency = -1;
	public Category category;
	public LocalDateTime timeStamp = LocalDateTime.now();
	
	public Task(int urgency, Category category) {
		this.urgency = urgency;
		this.category = category;
	}
	
	// we can encapulate this model class with private instance variables & setter/getter
	
	public String toString() {
		return "[TASK] URGENCY: " + urgency + " CATEGORY: " + category + " TIMESTAMP: " + timeStamp;
	}
}

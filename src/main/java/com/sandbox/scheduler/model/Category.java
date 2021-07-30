package main.java.com.sandbox.scheduler.model;


public enum Category {
	RED(1),
	GREEN(2),
	BLUE(3);
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	private Category(int value) {
		this.value = value;
	}
}

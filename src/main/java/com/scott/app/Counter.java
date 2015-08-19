package com.scott.app;

public class Counter implements ICounter {
	int i = 0;

	public int getCount() {
		return i;
	}

	public void increment() {
		i++;
	}
	
	public String getType() {
		return "Counter";
	}
}

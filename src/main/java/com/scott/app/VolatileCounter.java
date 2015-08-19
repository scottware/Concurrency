package com.scott.app;

public class VolatileCounter implements ICounter {
	volatile int i = 0;

	public int getCount() {
		return i;
	}

	public void increment() {
		i++;
	}

	public String getType() {
		return "VolatileCounter";
	}
}
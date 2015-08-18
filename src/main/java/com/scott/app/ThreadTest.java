package com.scott.app;

public class ThreadTest implements Runnable {

	Counter counter;

	public ThreadTest(Counter c) {
		this.counter = c;
	}

	public void run() {
		long startTime = System.currentTimeMillis(); // Get the start Time
		while (counter.getCount() < 1000) {
			counter.increment();
			System.out.println(Integer.toString(counter.getCount()));
		}
		long endTime = System.currentTimeMillis(); // Get the end Time
		long delta = endTime - startTime;
		System.out.println("Total time: " + Long.toString(delta));
	}

}

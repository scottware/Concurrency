package com.scott.app;

public class ThreadTest implements Runnable {

	ICounter counter;

	public ThreadTest(ICounter c) {
		this.counter = c;
	}

	public void run() {
		long startTime = System.currentTimeMillis(); // Get the start Time
		synchronized (counter) {
			while (counter.getCount() < 10000000) {
				counter.increment();
				//System.out.println(counter.getType() + " " + Integer.toString(counter.getCount()));
			}
		}
		long endTime = System.currentTimeMillis(); // Get the end Time
		long delta = endTime - startTime;
		System.out.println("Total time for " + counter.getType() + ": " + Long.toString(delta));
	}

}

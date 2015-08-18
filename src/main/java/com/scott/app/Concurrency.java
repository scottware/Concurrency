package com.scott.app;

public class Concurrency {
	public static void main(String[] args) {
		Counter c = new Counter();
		Thread a = new Thread(new ThreadTest(c));
		Thread b = new Thread(new ThreadTest(c));

		long startTime = System.currentTimeMillis(); // Get the start Time

		a.start();
		b.start();

		long endTime = System.currentTimeMillis(); // Get the end Time
		long delta = endTime - startTime;
		System.out.println("time: " + Long.toString(delta));
	}
}

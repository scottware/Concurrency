package com.scott.app;

public class Concurrency {
	public static void main(String[] args) {
		Counter counter = new Counter();
		AtomicCounter atomicCounter = new AtomicCounter();
		Thread a = new Thread(new ThreadTest(counter));
		Thread b = new Thread(new ThreadTest(counter));
		Thread c = new Thread(new ThreadTest(atomicCounter));
		Thread d = new Thread(new ThreadTest(atomicCounter));

		a.start();
		b.start();
		c.start();
		d.start();
	}
}

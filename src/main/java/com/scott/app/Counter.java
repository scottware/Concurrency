package com.scott.app;

import java.util.concurrent.atomic.*;


public class Counter {
	int i = 0;
	AtomicInteger atomicI = new AtomicInteger();

	public int getCount() {
		return i;
	}
	public AtomicInteger getAtomicCount() {
			return atomicI;
	}
	
	public void increment() {
		i++;
	}

	public void atomicIncrement() {
		atomicI.incrementAndGet();
	}

}

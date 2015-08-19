package com.scott.app;

import java.util.concurrent.atomic.*;

public class AtomicCounter implements ICounter {
	AtomicInteger atomicI = new AtomicInteger();

	public int getCount() {
		return atomicI.get();
	}

	public void increment() {
		atomicI.incrementAndGet();
	}

	public String getType() {
		return "AtomicCounter";
	}
}

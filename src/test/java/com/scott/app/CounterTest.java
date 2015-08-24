package com.scott.app;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CounterTest extends TestCase {

	@Test
	public void testGetType() {
		Counter counter = new Counter();
		String type = counter.getType();
		assertEquals(type, "Counter");
		//assertTrue(true);
	}

}

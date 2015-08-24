package com.scott.app;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class AtomicCounterTest extends TestCase {

	@Test
	public void testGetType() {
		AtomicCounter counter = new AtomicCounter();
		String type = counter.getType();
		assertEquals(type, "AtomicCounter");
	}

}

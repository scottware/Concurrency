package com.scott.app;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class VolatileCounterTest extends TestCase {

	@Test
	public void testGetType() {
		VolatileCounter counter = new VolatileCounter();
		String type = counter.getType();
		assertEquals(type, "VolatileCounter");
	}

}

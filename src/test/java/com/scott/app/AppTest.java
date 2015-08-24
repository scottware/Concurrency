package com.scott.app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CounterTest.class, AtomicCounterTest.class, VolatileCounterTest.class })

public class AppTest {
	// the class remains empty,
	// used only as a holder for the above annotations
}
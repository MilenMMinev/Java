package com.hackbulgaria.oop;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStack {

	StackImpl t1, t2;

	@Before
	public void setUp() throws Exception {
		t1 = new StackImpl(1,2,3,4);
		t2 = new StackImpl(1,2,3,4);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPush() {
		t2.push(4);
		assertTrue(t1.getStack().equals(t2.getStack()));
	}
	
	@Test
	public void testConstruct() {
	//	assertTrue(Arrays.equals(t1.getStack(), t2.getStack()));
	}

}

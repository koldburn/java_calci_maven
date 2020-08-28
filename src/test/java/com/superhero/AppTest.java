package com.superhero;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App app = new App();
		int a = 1234;
		int b = 5678;
		
		int expected = 6912;
		int actual = app.add(a,b);
		
		assertEquals(expected,actual);
	}

}
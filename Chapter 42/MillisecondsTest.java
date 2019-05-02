package ch42_25;

import static org.junit.Assert.*;

import org.junit.Test;

public class MillisecondsTest {

	@Test
	public void testconvertMilli() {
		assertEquals(Milliseconds.convertMilli(5500), "0:0:5");
		assertEquals(Milliseconds.convertMilli(100000), "0:1:40");
	}

}

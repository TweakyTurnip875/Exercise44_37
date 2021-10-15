package com.noah.Main;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
	@Test
	public void testWidth() {
		Exercise44_37 ex = new Exercise44_37();
		int[][] tests = {{3, 33, 33, 3}, {2, 2, 3, 1}};
		String[] results = {"03", "33", "033", "3"};
		for(int i = 0; i < tests[0].length; i++) {
			assertTrue(ex.format(tests[0][i], tests[1][i]).equals(results[i]));
		}
	}
}

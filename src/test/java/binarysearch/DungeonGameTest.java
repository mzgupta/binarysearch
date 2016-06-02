package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DungeonGameTest {

	DungeonGame problem;

	@Before
	public void setUp() throws Exception {
		problem = new DungeonGame();
	}

	@Test
	public void test() {
		int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };		
		Assert.assertEquals(7, problem.calculateMinimumHP(dungeon));
	}
}

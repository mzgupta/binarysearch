package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchA2DMatrixTest {

	SearchA2DMatrix problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new SearchA2DMatrix();
	}

	@Test
	public void test() {
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 },
				{ 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		Assert.assertTrue(problem.searchMatrix(matrix, 10));
		Assert.assertFalse(problem.searchMatrix(matrix, -90));

	}

}

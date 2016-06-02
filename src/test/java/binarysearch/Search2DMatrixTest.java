package binarysearch;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Search2DMatrixTest {
	Search2DMatrix problem;

	@Before
	public void setUp() throws Exception {
		problem = new Search2DMatrix();
	}

	@Test
	public void test() {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };

		Assert.assertEquals(true, problem.searchMatrix(matrix, 3));

		matrix = new int[][] { { 1, 3, 5, 7 }, { 23, 30, 34, 50 } };

		Assert.assertEquals(true, problem.searchMatrix(matrix, 7));

		matrix = new int[][] { { 1 } };
		Assert.assertEquals(true, problem.searchMatrix(matrix, 1));

		matrix = new int[][] { { 1, 1 } };
		Assert.assertEquals(false, problem.searchMatrix(matrix, 0));

	}
}

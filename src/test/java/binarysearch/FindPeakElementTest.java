package binarysearch;

import org.junit.Before;
import org.junit.Test;

public class FindPeakElementTest {

	FindPeakElement problem = null;

	@Before
	public void setUp() throws Exception {
		problem = new FindPeakElement();
	}

	@Test
	public void test() {
		int[] nums = { 7, 8, 1, 2, 9, 4, 99 };
		System.out.println(problem.findPeakElement(nums));
	}

}

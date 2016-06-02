package binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstBadVersionTest {
	FirstBadVersion problem;

	@Before
	public void setUp() throws Exception {
		problem = new FirstBadVersion();
	}

	@Test
	public void test1() {
		problem.setBadVersion(100);
		Assert.assertEquals(100, problem.firstBadVersion(900));
		Assert.assertEquals(100, problem.firstBadVersion(9999));
	}

}

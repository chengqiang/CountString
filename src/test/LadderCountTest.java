package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import day01.LadderCount;

public class LadderCountTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCount() {
		LadderCount ladderCount=new LadderCount();
		ladderCount.count();
	}

}

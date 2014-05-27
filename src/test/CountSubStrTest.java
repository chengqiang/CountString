package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import day01.CountSubStr;

public class CountSubStrTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCount() {
		CountSubStr count=new CountSubStr();
		String src="abcfgabcfdabcfggfdf<>gjh<<<>";
		System.out.println(count.count(src, "a"));
	}

}

package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import day01.ReadFile;
import day01.file;

public class ReadFileTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetFile() {
		ReadFile readFile=new ReadFile();
		readFile.GetFile("test");
		for(file f:ReadFile.flist){
			System.out.println(f);
		}
	}
}

package it.lorenticompany.ProvaIngSw_209555;

import static org.junit.Assert.assertEquals;

import java.util.Vector;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	public static MyListUtil myList;
	
	@BeforeClass
	public static void prepareAll() {
		System.out.println("before class");
		myList = new MyListUtil();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@Before
	public void prepareTest() {
		System.out.println("before");
	}

	@After
	public void cleanTest() {
		System.out.println("after");
	}

	@Test(expected = Exception.class)
	public void sortException() throws Exception {
		System.out.println("orderException");
		myList.sort(new Vector<Integer>(), -1);
	}

	@Test
	public void sortWorks() throws Exception {
		Vector<Integer> in = new Vector<Integer>();
		in.add(2);
		in.add(1);
		in.add(3);
		
		Vector<Integer> out = new Vector<Integer>();
		out.add(1);
		out.add(2);
		out.add(3);
		assertEquals(out, myList.sort(in, 0));
		assertEquals(out, myList.sort(in, 1));
	}


	@Test(timeout = 5000)
	public void sortIsFast() throws Exception {
		Vector<Integer> in = new Vector<Integer>();
		in.add(2);
		in.add(1);
		in.add(3);
		myList.sort(in, 0);
	}
}

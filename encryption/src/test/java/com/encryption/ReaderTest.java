package com.encryption;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;

import junit.framework.TestCase;


public class ReaderTest extends TestCase {
	
	private Writer writer;
	private static String FILE_NAME = "c:\\Attilio\\sample.txt";
	
	public void setUp() {
		List<String> list = new LinkedList<>();
		list.add("Sample1");
		list.add("Sample2");
		list.add("Sample3");

		writer = new Writer(FILE_NAME);
		writer.write(list);
	}

	public void testReadCount() {
		Reader reader = new Reader(FILE_NAME);
		List<String> list = reader.read();
		Assert.assertEquals(list.size(), 3);
	}

	public void testReadContent() {
		Reader reader = new Reader(FILE_NAME);
		List<String> list = reader.read();
		Assert.assertEquals(list.get(1), "Sample2");
	}

	public void tearDown() {
		File file = new File(FILE_NAME);
		file.delete();
	}

}

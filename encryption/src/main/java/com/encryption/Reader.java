package com.encryption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Reader {

	private String fileName;
	
	public Reader(String fileName) {
		this.fileName = fileName;
	}
	
	public List<String> read() {
		List<String> linkedList = new LinkedList<>();
	
		try (BufferedReader br = new BufferedReader( new FileReader(fileName) );) {
			String line;
			while ((line = br.readLine()) != null) {
				linkedList.add(line);
			}
		} catch (IOException exception) {
			System.out.println("Cannot read file.");
		}
		
		return linkedList;
	}
	
}

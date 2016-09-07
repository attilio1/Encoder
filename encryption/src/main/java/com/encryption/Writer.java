package com.encryption;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {

	private String fileName;

	public Writer(String fileName) {
		this.fileName = fileName;
	}
	
	public void write(List<String> list) {
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(fileName) );) {
			for (String text : list) {
				bw.write(text);
				bw.write("\r\n");
			}
		} catch (IOException exception) {
			System.out.println("Cannot write to file.");
		}
	}
}

package com.encryption;

import java.util.List;

public class Executor {

	public static void main(String[] args) {
		Executor executor = new Executor();
		System.out.println("Process Started.");
		executor.execute();
		System.out.println("Process Completed.");
	}
	
	private void execute() {
		System.out.println("Process Reading...");
		Reader reader = new Reader("c:\\Attilio\\inputs.txt");
		List<String> list = reader.read();
		if (!list.isEmpty()) {
			System.out.println("Process Encoding...");
			Encoder encoder = new Encoder();
			List<String> outList = encoder.decode(list);
			
			System.out.println("Process Wrinting...");
			Writer writer = new Writer("c:\\Attilio\\outputs.txt");
			writer.write(outList);
		}
	}
}

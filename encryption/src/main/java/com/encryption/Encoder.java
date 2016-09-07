package com.encryption;

import java.util.LinkedList;
import java.util.List;

public class Encoder {

	public Encoder() {
	}
	
	public static void main(String[] args) {
		Encoder enconder = new Encoder();
		System.out.println(enconder.encode("*CDC is the trademark of the Control Data Corporation."));
		System.out.println(enconder.decode("1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5"));
	}

	public String encode (String text) {
		return encode (text, false);
	}
	
	public String decode (String text) {
		return encode (text, true);
	}

	public List<String> decode (List<String> list) {
		List<String> outList = new LinkedList<>();
		for(String text : list) {
			outList.add(decode(text));
		}
		return outList;
	}
	
	private String encode (String text, boolean encoding) {
		String newText = "";
		char[] characters = text.toCharArray();
		for (int index = 0; index < characters.length; index++) {
			int ascii = (int) characters[index];
			int newascii = ascii + (encoding ? -1 : 1) * 7;
			char character = (char) newascii;
			newText = newText + String.valueOf(character);
		}
		
		return newText;
	}
}

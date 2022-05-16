package com.algo.string;

public class CaesarCipherEncryptor {
	public static String caesarCypherEncryptor(String str, int key) {
		for (int i = 0; i < str.length(); i++) {
			getCharOfSwift(str.charAt(i), i);
		}
		return "";
	}

	private static char getCharOfSwift(char charAt, int i) {
		int val = charAt+i;
		return (char) (val <=122 ? val: (96+ val%122)) ; 
	}
}

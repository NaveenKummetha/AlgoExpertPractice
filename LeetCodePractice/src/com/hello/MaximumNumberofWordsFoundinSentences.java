package com.hello;

public class MaximumNumberofWordsFoundinSentences {
	public static void main(String[] args) {

	}

	public int mostWordsFound(String[] sentences) {
		int val = 0;
		for (String string : sentences) {
			int len  = string.split(" ").length;
			if (len> val ) {
				val = len; 
			};
		}
		return val;

	}
}

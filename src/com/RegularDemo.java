package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo {

	public static void main(String[] args) {
		
//		Pattern p = Pattern.compile("\\D");
		String s = "india is my country 7989898";
		
		String[] m = s.split("\\d");
		
		for(String m1 : m) {
			System.out.print(m1);
		}
		
	}

}

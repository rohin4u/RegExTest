package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberDemo {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("(0|91)[7-9][0-9]{9}");
		String s = "09898989898";
		
		Matcher m = p.matcher(s);
		
		if(m.find()&&m.group().equals(s)) {
			
			System.out.println("valid number");
		}
		else {
			System.out.println("invalid number");
		}

	}

}

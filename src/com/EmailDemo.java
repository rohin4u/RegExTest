package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		
		Matcher m = p.matcher(args[0]);
		
		if(m.find()&&m.group().equals(args[0])) {
			
			System.out.println("valid email id");
		}
		else {
			System.out.println("invalid email id");
		}

	}

}

package com;

import java.util.StringTokenizer;

public class StrDemo {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("india_is_my_country", "+1");
		
		while(st.hasMoreElements()) {
			
			System.out.println(st.nextElement());
		}

	}

}

package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char[] c = {'T','h','i','s',' ','i','s', ' ', 'a',' ', 'p','e','n','c','i','l'};
		
		for(int i=0; i<c.length; i++) {
			
			System.out.print(c[i]);
		}
		System.out.println();
		c[4] = ',';
		c[7] = ',';
		c[9] = ',';
		System.out.println(c);

	}

}

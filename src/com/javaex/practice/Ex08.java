package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*45)+1;
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print((int)(Math.random()*45)+1 + "\t");
			
		}
		
	}
}

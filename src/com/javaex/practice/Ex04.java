package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		int a = 0; 
		int b = 0;
		
		for(int i=0; i<data.length; i++) {
			if(data[i] % 3 == 0) {
				a++; //3의 배수의 개수
				b = b + data[i]; //3의 배수의 총합
			}
			
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 => " + a); //3의 배수 개수
		System.out.println("주어진 배열에서 3의 배수의 합 => " + b); //3의 배수의 총합
	}
	
	
	
	
}

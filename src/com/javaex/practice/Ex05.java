package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];

		int sum = 0;
		
		for(int i=0; i<num.length; i++) {
			
			num[i] = sc.nextInt();
			sum = sum + num[i];
			
		}
		double average = sum / num.length;
		
		System.out.println("평균은 " + average + " 입니다.");
		
		sc.close();
	}

}

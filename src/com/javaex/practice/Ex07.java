package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액: ");
		int price = sc.nextInt();
		
		int[] won = new int[10];
		
		won[0] = 50000;
		won[1] = 10000;
		won[2] = 5000;
		won[3] = 1000;
		won[4] = 500;
		won[5] = 100;
		won[6] = 50;
		won[7] = 10; 
		won[8] = 5;
		won[9] = 1;
		
		for(int i=0; i<won.length; i++) {
			int sum = won[i];
			int a = price / sum;
			price = price - (a * sum);
			System.out.println(sum + "원:" + a + "개");
		}
		
		
		sc.close();
	}

}

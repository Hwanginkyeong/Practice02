package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num   = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num_1 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int num_2 = sc.nextInt();
		if(num>num_1 && num>num_2) {
			System.out.println("num");
		}else if(num_1>num && num_1>num_2) {
			System.out.println("num_1");
		}else if(num_2>num && num_2>num_1) {
			System.out.println("num_2");
		}
		

		
		
	
		
		// System.out.println("가장 작은수는" + result +"입니다.");
		
		
		sc.close();

	}

}

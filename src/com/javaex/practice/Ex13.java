package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		double result1 =((num*num*num)-(9*num) +2);
		double result2 = 7*num + 2;
	
		if(num<=0) {
			System.out.print("계산결과는 "+ result1);
		}else if(num>0) {
			System.out.print("계산결과는 " + result2);
		}System.out.println(" 입니다.");
		
		
		
		
		sc.close();

	}

}

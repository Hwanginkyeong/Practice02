package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요.");
		
		System.out.print("기호: ");
		String symbol = sc.nextLine();
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		if(symbol == "*") {
			System.out.println(num1*num2);
		}else if(symbol =="/") {
			System.out.println(num1/num2);
		}else if(symbol =="+") {
			System.out.println(num1+num2);
		}else if(symbol =="-") {
			System.out.println(num1-num2);
		}System.out.print("결과는: ");
			
		
		
		
		
		
		
		/*
		if(symbol == "*") {
			System.out.println(num1 * num2);
		}System.out.println("결과는: "+ num1*num2);
	
		if(symbol == "/") {
			System.out.println(num1/num2);
		}System.out.println("결과는: "+num1/num2);
		
		if(symbol == "+") {
			System.out.println(num1+num2);
		}System.out.println("결과는: "+(num1+num2));
		
		if(symbol == "-") {
			System.out.println(num1-num2);
		}System.out.println("결과는: "+(num1-num2));
		*/
		
		
		
		
		sc.close();
		

	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		double height;
		System.out.print("키: ");
		height = sc.nextDouble();
	
		double weight;
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		

		double normalweight = (height-100)*0.9;
		
		if(weight==normalweight) {
			System.out.print("표준");
			
		}else if(weight>normalweight) {
			System.out.print("과체중");
			
		}else if(weight<normalweight){
			System.out.print("저체중");
		}
		System.out.println(" 입니다.");

		System.out.println("표준체중:"+ normalweight);
		
		

		sc.close();
		
		

	}

}

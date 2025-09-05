package assignment04;

import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MinNum=0;
		System.out.print("세 개의 정수값을 입력하세요>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		MinNum = (num1>num2) ? num2:num1;
		MinNum = (MinNum>num3) ? num3:MinNum;
		
		System.out.println("세 값 중 가장 작은 값은 "+MinNum+"입니다.");
		
	}

}

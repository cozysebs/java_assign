package assign02;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요>> ");
		int num = sc.nextInt();
		int first = num / 10;
		int second = num % 10;
		
		if ((first%3==0) && (second%3==0) && (first != 0) && (second != 0)) {
			System.out.println("박수짝짝");
		}
		else if ( ((first%3!=0) || (first == 0)) && (second%3==0) && (second != 0) ) {
			System.out.println("박수짝");
		} 
		else if ( (first%3==0) && ((second%3!=0) || (second == 0)) && (first != 0) ) {
			System.out.println("박수짝");
		}
		else {
			System.out.println("박수없음.");
		}
		
	}

}

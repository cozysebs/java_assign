package assignment04;

import java.util.Scanner;

public class IntInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하면 자리수를 출력합니다>>");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=0; ;i++) {
			if(num>=10) {
				num /= 10;
				count++;
			}
			else {break;}
		}
		System.out.println((count+1)+"자리수입니다.");
	}

}

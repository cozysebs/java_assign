package assignment04;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = 50000;
		int x2 = 10000;
		int x3 = 5000;
		int x4 = 1000;
		
		System.out.print("지불할 금액을 입력하세요(최소 천원 단위) >>");
		int money = sc.nextInt();
		
		if(money >= x1) {
			int y1 = money/x1;
			money %= x1;
			System.out.print(x1+"원권 "+y1+"개, ");
		}
		if(money >= x2) {
			int y2 = money/x2;
			money %= x2;
			System.out.print(x2+"원권 "+y2+"개, ");
		}
		if(money >= x3) {
			int y3 = money/x3;
			money %= x3;
			System.out.print(x3+"원권 "+y3+"개, ");
		}
		if(money >= x4) {
			int y4 = money/x4;
			money %= x4;
			System.out.print(x4+"원권 "+y4+"개");
		}
	}

}
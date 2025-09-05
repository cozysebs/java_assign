package assignment04;

import java.util.Scanner;

public class MoneyRefactoring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = {50000, 10000, 5000, 1000};
		int[] y = new int[4];
		
		System.out.println("지불할 금액을 입력하세요(최소 천원 단위) >>");
		int money = sc.nextInt();
		
		for(int i=0; i<x.length; i++) {
			if(money >= x[i]) {
				y[i] = money/x[i];
				System.out.print(x[i]+"원권 "+y[i]+"개");
			}
			money %= x[i];
			if(money == 0)
				System.out.print("");
			else
				System.out.print(", ");
			
		}
	}

}
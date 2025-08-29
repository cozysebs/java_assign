package assign02;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요>> ");
		int money = sc.nextInt();
		int fifty_thous_moeny;
		int ten_thous_moeny;
		int thous_moeny;
		int five_hund_moeny;
		int hund_moeny;
		int ten_moeny;
		int one_moeny;
		
		if (money >= 50000) {
			fifty_thous_moeny = (money / 50000);
			money = (money - (fifty_thous_moeny * 50000));
			System.out.print("오만원" + fifty_thous_moeny + "개, ");
		}
		else {
			System.out.print("오만원0개, ");
		}
		if (money >= 10000) {
			ten_thous_moeny = (money / 10000);
			money = (money - (ten_thous_moeny * 10000));
			System.out.print("만원" + ten_thous_moeny + "개, ");
		}
		else {
			System.out.print("만원0개, ");
		}
		if (money >= 1000) {
			thous_moeny = (money / 1000);
			money = (money - (thous_moeny * 1000));
			System.out.print("천원" + thous_moeny + "개, ");
		}
		else {
			System.out.print("천원0개, ");
		}
		if (money >= 500) {
			five_hund_moeny = (money / 500);
			money = (money - (five_hund_moeny * 500));
			System.out.print("500원" + five_hund_moeny + "개, ");
		}
		else {
			System.out.print("500원0개, ");
		}
		if (money >= 100) {
			hund_moeny = (money / 100);
			money = (money - (hund_moeny * 100));
			System.out.print("100원" + hund_moeny + "개, ");
		}
		else {
			System.out.print("100원0개, ");
		}
		if (money >= 10) {
			ten_moeny = (money / 10);
			money = (money - (ten_moeny * 10));
			System.out.print("10원" + ten_moeny + "개, ");
		}
		else {
			System.out.print("10원0개, ");
		}
		if (money >= 1) {
			one_moeny = (money / 1);
			money = (money - (one_moeny * 1));
			System.out.print("1원" + one_moeny + "개, ");
		}
		else {
			System.out.print("1원0개, ");
		}
	}


}

package assign02;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("커피 주문하세요>> ");
		String coffee = sc.next();
		int cup = sc.nextInt();
		int price = 0;
		double discount = 0.95;
		
		if ((cup >= 10) && coffee.equals("에스프레소")) {
			System.out.println((int)(2000*discount*cup) + "원입니다.");
		}
		else {
			if (coffee.equals("에스프레소")) {
				price = 2000;
			}
			else if (coffee.equals("아메리카노")) {
				price = 2500;
			}
			else if (coffee.equals("카푸치노")) {
				price = 3000;
			}
			else if (coffee.equals("카페라떼")) {
				price = 3500;
			}
			System.out.println(price*cup + "원입니다.");
		}
	}

}

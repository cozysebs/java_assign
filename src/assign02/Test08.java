package assign02;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("커피 주문하세요>> ");
		String coffee = sc.next();
		int cup = sc.nextInt();
		int price = 0;
		
		//if문
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
		
		
		//switch문
//		switch (coffee) {
//		case "에스프레소" : System.out.println(2000*cup + "원입니다.");break; 
//		case "아메리카노" : System.out.println(2500*cup + "원입니다.");break; 
//		case "카푸치노" : System.out.println(3000*cup + "원입니다.");break;
//		case "카페라떼" : System.out.println(3500*cup + "원입니다.");break; 
//		}
	}

}

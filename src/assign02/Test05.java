package assign02;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("논리 연산을 입력하세요>> ");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		
		switch(op) {
		case "AND" : System.out.println(a && b);break;
		case "OR" : System.out.println(a || b);break;
		}	
	}

}

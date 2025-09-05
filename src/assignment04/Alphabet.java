package assignment04;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String alphabet = sc.next();
		char alpha = alphabet.charAt(0);
		
		for(int i=0; i<=(int)(alpha-'a'); i++) {
			for(int j=(int)'a'; j<=(int)alpha-i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}

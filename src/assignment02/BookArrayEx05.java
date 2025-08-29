package assignment02;

import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayEx05 {
	static Scanner sc;
	
	static void input(ArrayList<Book> b) {
		System.out.print("책의 종류 선택 (1.종이책, 2.전자책) >> ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("책제목, 저자, 출판사, 분류 입력 >> ");
			String title = sc.next();
			String author = sc.next();
			String publisher = sc.next();
			String sort = sc.next();
			b.add(new Book(title, author, publisher, sort));
			break;
		case 2:
			System.out.print("책제목, 저자, 출판사, 분류 입력 >> ");
			title = sc.next();
			author = sc.next();
			publisher = sc.next();
			sort = sc.next();
			int serviceTime = sc.nextInt();
			int serviceMachines = sc.nextInt();
			b.add(new EBook(title, author, publisher, sort, serviceTime, serviceMachines));
			break;
		default: System.out.println("입력오류");
		}
	}
	
	static void search(ArrayList<Book> b) {
		System.out.println("검색할 잭체목 입력 >> ");
		String title = sc.next();
		boolean flag = false;
		for(int i=0; i<b.size(); i++) {
			if(b.get(i).getTitle().equals(title)) {
				System.out.println(b.get(i));
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("찾는 값이 없습니다.");
		}
	}
	
	static void allShow(ArrayList<Book> b) {
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		
		boolean flag = false;
		
		while(true) {
			System.out.print("1.데이터입력 | 2.데이터조회 | 3.전체데이터출력 | 4.종료 >> ");
			int num = sc.nextInt();
			switch(num) {
			case 1: input(books); break;
			case 2: search(books); break;
			case 3: allShow(books); break;
			case 4: flag=true; break;
			default:System.out.println("입력오류");
			}
			if(flag)
				break;
		}
		System.out.println("프로그램 종료");
	}

}

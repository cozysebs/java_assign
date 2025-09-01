package assignment03;

import java.util.HashMap;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		
		System.out.println("나라이름과 인구를 입력하세요.");
		while(true) {
			System.out.print("나라 이름, 인구>> ");
			String nationName = sc.next();
			if(nationName.equals("그만"))
				break;
			int population = sc.nextInt();
			nations.put(nationName, population);
		}
		
		while(true) {
			System.out.println("인구 검색>> ");
			String key = sc.next();
			if(key.equals("그만")) {
				System.out.println("End");
				break;
			}
				
			
			boolean flag = nations.containsKey(key);
			if(flag)
				System.out.println(key + " 인구는 " + nations.get(key));
			else
				System.out.println(key + " 나라는 없습니다." );
		}
	}

}

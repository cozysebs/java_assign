package assignment03;

import java.util.Scanner;
import java.util.Vector;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vi = new Vector<>();
		
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			int rainfall = sc.nextInt();
			if(rainfall == 0) {
				System.out.println("End");
				break;
			}
			
			vi.add(rainfall);
			for(int i=0; i<vi.size(); i++) {
				System.out.print(vi.get(i) + " ");
			}
			System.out.println();
			
			int sum = 0;
			for (int i=0; i<vi.size(); i++) {
				sum += vi.get(i);
			}
			int avg = sum/vi.size();
			System.out.println("현재 평균 : " + avg);
		}
	}

}

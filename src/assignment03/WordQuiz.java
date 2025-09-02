package assignment03;

import java.util.Scanner;
import java.util.Vector;

class Words {
	private String english;
	private String korean;
	
	public Words() {}
	public Words(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}
	
	public String getEng() {return english;}
	public String getKor() {return korean;}
	
}

public class WordQuiz {
	
	private String name;
	private Scanner sc = new Scanner(System.in);
	private Vector<Words> v;
	
	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Words>();
		v.add(new Words("love", "사랑"));
		v.add(new Words("animal", "동물"));
		v.add(new Words("emotion", "감정"));
		v.add(new Words("human", "인간"));
		v.add(new Words("stock", "주식"));
		v.add(new Words("trade", "거래"));
		v.add(new Words("society", "사회"));
		v.add(new Words("baby", "아기"));
		v.add(new Words("honey", "애인"));
		v.add(new Words("dall", "인형"));
		v.add(new Words("bear", "곰"));
		v.add(new Words("picture", "사진"));
		v.add(new Words("painting", "그림"));
		v.add(new Words("fault", "오류"));
		v.add(new Words("example", "보기"));
		v.add(new Words("eye", "눈"));
		v.add(new Words("statue", "조각상"));
	}
	
	private int makeExample(int ex[], int answerIndex) {
		int n[] = {-1,-1,-1,-1};
		int index;
		for(int i=0; i<n.length; i++) {
			do {
				index = (int)(Math.random()*v.size());
			} while(index == answerIndex || exists(n, index));
			n[i] = index;
		}
		
		for(int i=0; i<n.length; i++) ex[i] = n[i];
		return (int)(Math.random()*n.length);
	}

	private boolean exists(int[] n, int index) {
		for(int i=0; i<n.length; i++) {
			if(n[i] == index)
				return true;
		}
		return false;
	}
	
	public void run() {
		System.out.println("**** 영어 단어 테스트 프로그램 " + name + "입니다. ****");
		while(true) {
			System.out.println("단언테스트(1), 단어삽입(2), 종료(3)>> ");
			try {
				int menu = sc.nextInt();
				switch(menu) {
				case 1: //단어테스트
				case 2: //단어 삽입
				case 3: //종료
				default: System.out.println("잘못 입력했습니다.");
				}
			} 
		}
	}

	public static void main(String[] args) {
		
	}

}








































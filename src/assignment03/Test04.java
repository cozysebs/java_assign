package assignment03;

import java.util.Scanner;
import java.util.Vector;

//1. 영어 단어와 한글 단어로 구성되는 Word 클래스를 작성하고
//2. 프로그램 내에서 미리 여러 개의 Word 객체를 Vector<Word> 컬렉션에 삽입해둔다. 
// 1,2 완

//3. 그리고 다음 결과와 같이 랜덤하게 사용자에게 문제를 던진다. 
//4. 벡터 내에 정답이 아닌 단어를 랜덤하게 3개 선택하고 정답과 함께 4개의 보기를 출력한다.

class Word {
	String eng;
	String kor;
	
	public Word() {}
	public Word(String kor, String eng) {
		this.eng = eng;
		this.kor = kor;
	}

	public String getKor() {
		return kor;
	}
	public String getEng() {
		return eng;
	}	
}


public class Test04 {
	static Scanner sc;
	static Vector<Word> vw;
	
	static void plus() {
		vw.add(new Word("apple", "사과"));
		vw.add(new Word("book", "책"));
		vw.add(new Word("car", "자동차"));
		vw.add(new Word("dog", "개"));
		vw.add(new Word("house", "집"));
		vw.add(new Word("water", "물"));
		vw.add(new Word("food", "음식"));
		vw.add(new Word("computer", "컴퓨터"));
		vw.add(new Word("phone", "전화기"));
		vw.add(new Word("tree", "나무"));
	}
	
	static void test() {
		System.out.println("현재 " + vw.size() + "개의 단어가 들어있습니다. -1을 입력하면 테스트를 종료합니다.");
		// Vector<Word>에 저장되어 있는 eng 값을 랜덤하게 꺼낸다.
		// Vector<Word>에 저장되어 있는 kor 값을 eng와 매치되는 값 1개 매치되지 않는 값 3개를 꺼낸다.
		// eng 값과 kor 값이 매치되면 Excellent! 매치되지 않으면 No!를 출력한다.
		
		// 0~vw.size() 사이의 값을 랜덤하게(랜덤 함수) i로 출력.
//		for(int i=0; i<vw.size(); i++) {
//		System.out.println(vw.get((int)(Math.random()*vw.size())));
//		}
		
	}
	
	static void input() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while(true) {
			System.out.print("영어 한글 입력>> ");
			String eng = sc.next();
			if(eng.equals("그만"))
				break;
			String kor = sc.next();
			vw.add(new Word(eng, kor));
		}
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		vw = new Vector<>();
		
		plus(); //이렇게 해도 되려나..?
		
		System.out.println("------------------------------------------------------------");
		System.out.println("**********영어 단어 테스트 프로그램**********");
		System.out.println("영어단어 테스트를 시작합니다.");
		
		while(true) {
			System.out.print("단어 테스트(1), 단어 삽입(2), 종료(3) >> ");
			int num = sc.nextInt();
			boolean flag = false;
			switch(num) {
			case 1: test();break;
			case 2:	input();break;
			case 3:flag=true;break;
			default:System.out.println("1~3 사이의 정수를 입력하세요.");break;
			}
			if(flag)
				break;
		}
		System.out.println("영어단어 게임을 종료합니다.");
	}

}

package assignment03;

import java.util.InputMismatchException;
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
	
	private int makeExample(int ex[], int answerIndex) { //wordQuiz에서 한글 <보기>의 배열을 만든다.
		int n[] = {-1,-1,-1,-1}; // 4개의 <보기>를 만들기 위한 배열 초기화
		int index; // n[]에 v의 index 값을 저장한다.
		for(int i=0; i<n.length; i++) {
			do {
				index = (int)(Math.random()*v.size()); //index는 0~16 사이의 값을 가진다. -> v의 값을 지정할 수 있는 index.
			} while(index == answerIndex || exists(n, index)); //index가 answerIndex와 같거나 n[]에 이미 있는 index라면 다시 do로 돌아가서 새로운 index 생성.
			n[i] = index; //while 조건을 벗어나는 index 값이라면 n[] i번째에 index 값을 저장한다.
		}
		
		for(int i=0; i<n.length; i++) ex[i] = n[i]; //-> n[]에 저장된 index 값을 ex[]에 저장한다.
		return (int)(Math.random()*n.length); //-> makeExample() 메소드의 return 값. 해당 값은 0~3 사이의 랜덤 정수. <보기>에 정답이 지정될 위치(wordQuiz에서 example에 지정되는 정답 위치). 
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
			System.out.println("단어테스트(1), 단어삽입(2), 종료(3)>> ");
			try {
				int menu = sc.nextInt();
				switch(menu) {
				case 1: wordQuiz(); break;
				case 2: insertWords(); break;
				case 3: finish(); return;
				default: System.out.println("잘못 입력했습니다.");
				}
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println("숫자를 입력하세요!!");
			}
			System.out.println();
		}
	}
	
	private void insertWords() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while(true) {
			System.out.println("영어 한글 입력 >>");
			String engWord = sc.next();
			if(engWord.equals("그만"))
				break;
			
			String korWord = sc.next();
			v.add(new Words(engWord, korWord));
		}
	}
	
	private void finish() {
		System.out.println("\"" + name + "\"를 종료합니다.");
		sc.close();
	}
	
	private void wordQuiz() {
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
		while(true) {
			int answerIndex = (int)(Math.random()*v.size()); //0~16 사이의 숫자를 랜덤하게 뽑는다.
			String eng = v.get(answerIndex).getEng(); //v에 저장된 answerIndex(0~16) 위치에 있는 english를 eng에 저장한다.
			
			int example[] = new int [4];
			
			int answerLoc = makeExample(example, answerIndex); //-> example[]에 answerIndex를 제외한 v의 index가 저장됨. return 값으로 0~3 사이의 숫자가 answerLoc에 저장됨.
			example[answerLoc] = answerIndex; //-> example[]에 answerLoc(0~3) 위치에 answerIndex가 저장됨.
			
			System.out.println(eng + "?");
			
			for(int i=0; i<example.length; i++)
				System.out.println("(" + (i+1) + ")" + v.get(example[i]).getKor() + " ");
			
			System.out.print(":>");
			try {
				int in = sc.nextInt();
				if(in == -1)
					break;
				
				in--;
				if(in == answerLoc)
					System.out.println("Excellent!!");
				else
					System.out.println("No !!");
			} catch(InputMismatchException e) {
				sc.next();
				System.out.println("숫자를 입력하세요 !!");
			}
		}
	}

	public static void main(String[] args) {
		WordQuiz quiz = new WordQuiz("명품영어");
		quiz.run();
	}

}








































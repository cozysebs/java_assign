package assignment03;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	String name;
	String major;
	int sno;
	double scoreAvg;
	
	public Student() {}
	public Student(String name, String major, int sno, double scoreAvg) {
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.scoreAvg = scoreAvg;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public double getScoreAvg() {
		return scoreAvg;
	}
	public void setScoreAvg(double scoreAvg) {
		this.scoreAvg = scoreAvg;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n" + "학과 : " + major + "\n" + "학번 : " + sno + "\n" + "학점 평균 : " + scoreAvg;
	}
	
	
	
}

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		System.out.println("------------------------------------------");
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요");
		while(students.size()<5) {
			System.out.print(">> ");
			String name = sc.next();
//			if(name.equals("exit"))
//				break;
			String major = sc.next();
			int sno = sc.nextInt();
			double scoreAvg = sc.nextDouble();
			students.add(new Student(name, major, sno, scoreAvg));
			}
		for(int i=0; i<students.size(); i++) {
			System.out.println("------------------------------------------");
			System.out.println(students.get(i));
		}
		
		System.out.println("------------------------------------------");
		
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			boolean flag = false;
			for(int i=0; i<students.size(); i++) {
				Student s = students.get(i);
				if(s.getName().equals(name)) {
					System.out.print(s.getName() + ", " + s.getMajor() + ", " + s.getSno() + ", " + s.getScoreAvg() + "\n");
					flag = true;
				}
			}
			if(!flag)
				System.out.println("데이터를 찾지 못했습니다.");
		}
		System.out.println("검색 종료.");
	}

}
























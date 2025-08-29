package assignment02;

class EBook extends Book {
	//필드
	private int serviceTime;
	private int serviceMachines;
	
	//생성자
	public EBook() {}
	public EBook(String title, String author, String publisher, String sort, int serviceTime, int serviceMachines) {
		super(title, author, publisher, sort);
		this.serviceTime = serviceTime;
		this.serviceMachines = serviceMachines;
	}
	
	//접근자와 설정자
	public int getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}
	public int getServiceMachines() {
		return serviceMachines;
	}
	public void setServiceMachines(int serviceMachines) {
		this.serviceMachines = serviceMachines;
	}
	
	@Override
	public String toString() {
		
		return getTitle() + "\t" + getAuthor() + "\t" + getPublisher() + "\t" + getSort() + "\t" + getServiceTime() + "\t" + getServiceMachines();
	}
	
	
	
	
	
	
	
}

public class EBookEx04 {

	public static void main(String[] args) {
		EBook eb1 = new EBook("82년생 김지영", "조남주", "민음사", "소설", 30, 5);
		
		EBook eb2 = new EBook();
		eb2.setTitle("파리아파트");
		eb2.setAuthor("기욤 뮈소");
		eb2.setPublisher("밝은 세상");
		eb2.setSort("소설");
		eb2.setServiceTime(30);
		eb2.setServiceMachines(2);
		
		System.out.println("제목" + "\t" + "저자" + "\t" + "출판사" + "\t" + "분류" + "\t" + "유효기간" + "\t" + "사용기기수");
		System.out.println(eb1);
		System.out.println(eb2);
	}

}

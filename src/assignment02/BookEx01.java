package assignment02;

class Book {
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	public Book() {}
	public Book(String title, String author, String publisher, String sort) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}
	public Book(String title) {
		this.title=title;
	}
	
	@Override
	public String toString() {
		return getTitle() + "\t" + getAuthor() + "\t" + getPublisher() + "\t" + getSort();
	}
}

public class BookEx01 {

	public static void main(String[] args) {
		
		Book b1 = new Book("82년생 김지영", "조남주", "민음사", "소설");
		
		Book b2 = new Book();
		b2.setTitle("파리아파트");
		b2.setAuthor("기욤 뮈소");
		b2.setPublisher("밝은 세상");
		b2.setSort("소설");
		
		Book b3 = new Book("자료구조");
		b3.setAuthor("이자료");
		b3.setPublisher("DB출판사");
		b3.setSort("컴퓨터/IT");
		
		System.out.println("제목" + "\t" + "저자" + "\t" + "출판사" + "\t" + "분류");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
	}

}

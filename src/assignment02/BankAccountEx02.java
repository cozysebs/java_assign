package assignment02;

//계좌이체 함수 만들어야 함.

class BankAccount {
	//필드
	private String accountNumber;
	private String owner;
	private int balance;
	
	//get, set
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	//생성자
	public BankAccount() {}
	public BankAccount(String accountNumber, String owner, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}
	
	//입금
	public int deposit(int x) {		// 계좌에 x만큼 더한다.
		System.out.println(getOwner() + " 고객님, " + x + "원 입금되었습니다.");
		return balance += x;	
	}
	
	//출금
	public void withdraw(int y) {	// 계좌에 y만큼 뺀다. //  단 출금함수은 잔액보다 출금액이 크지 않아야 한다.
		if(balance >= y) {
			balance -= y;
			System.out.println(getOwner() + " 고객님, " + y + "원 출금되었습니다. ");
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	//잔액조회
	public void getBal() {		// 계좌의 값을 출력한다.
		System.out.println(getOwner() + " 고객님의 현재 잔액은 " + getBalance() + "원입니다.");
	}
	
	//계좌 이체 함수
	public void transfer(int amount, BankAccount b1, BankAccount b2) {
		if(amount > b1.balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
		System.out.println(b1.owner + " 고객님이 " + b2.owner + " 고객님에게 " + amount + "원 송금했습니다.");
		b1.balance -= amount;
		b2.balance += amount;
		}
	}
	
}

public class BankAccountEx02 {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("01", "Lee", 0);
		BankAccount b2 = new BankAccount("02", "Kim", 2000);
		
		b1.deposit(10000);
		b1.withdraw(3000);
		b1.getBal();
		
		b1.transfer(5000, b1, b2);
		b1.getBal();
		b2.getBal();
		
		b1.transfer(5000, b1, b2);
		b1.getBal();
		b2.getBal();
	}

}



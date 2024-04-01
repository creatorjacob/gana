package exceptionEx;
//은행계좌 클래스(국민은행)
public class Account {
	//멤버변수(필드)
	String accountNo; //계좌번호
	String ownerName; //예금주이름
	int balance; 	  //잔액
	
	//생성자
	public Account() {
		
	}
	//매개변수가 있는 생성자(source->generate constructor 어쩌고
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo; //this.accountNo -> 멤버변accountNo -> 매개변수
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	//예금한다 메서드
	void deposit(int amount) {
		balance+=amount;
	}
	
	//인출한다 메서드
	int withdraw(int amount) throws InsufficientException {
		if(balance < amount) {
			throw new InsufficientException("잔고 부족(" + (amount-balance) + "원 모자람)");
		}
		balance-=amount;
		return amount;
	}
	
	
}//class end

package week10;

public class Account {
	private String accNo;
	private String owner;
	private int balance;
	
	public Account(String accNO, String owner, int balance) {
		this.accNo = accNo;
		this.owner= owner;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
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
	
	//public void setBalance(int balance) {
		//if (balance >= 0 && balance <= 1000000)
			//this.balance = balance;
		//else 
			//System.out.println("잔고 설정 오류");
	//}
	

}

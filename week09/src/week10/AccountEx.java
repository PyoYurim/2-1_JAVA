package week10;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.accNo(123-45-6789);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.owner(ȫ�浿);
		System.out.println("���� �ܰ� : " + account.getBalance());
		
		account.balance(100000);
		System.out.println();
	}

}

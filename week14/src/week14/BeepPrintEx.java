package week14;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("��~");
			Thread.sleep(500); //�Ͻ����� 0.5��
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(500);
		}
		
	}

}

package week14;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("삐~");
			Thread.sleep(500); //일시정지 0.5초
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(500);
		}
		
	}

}

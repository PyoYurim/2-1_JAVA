package week14;

public class ThreadABEx {

	public static void main(String[] args) {
		Thread main Thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread);
		
		Thread threadA = new ThreadA();
		threadA.start();
		System.out.println("작업 스레드 이름 -" threadA.getName());
		
		Thread threadB = new thread
				
	}
}

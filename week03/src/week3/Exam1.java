package week3;

public class Exam1 {
	public static void main(String[] args) {
		int distance = 100;
		int second   = 5;
		
		double velocity = (double)distance / (second*60);
		
		System.out.println("5�е��� 100m�� �̵��ϴ� ��ü�� �ӷ���");
		System.out.printf("%.4fm/s�Դϴ�", velocity);
	}
}

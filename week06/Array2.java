package week5;
//���̰� 10�� ���� Ÿ���� �迭�� �����ϴ� -> int[] �迭�̸� = new int[�迭�� ����]
//�� �迭 ���� �����ϰ� ������ ����(0~99)�� �����Ѵ� -> �����Լ�
//���� ������ �������� ���� �� ����� ����Ͻÿ� -> �ݺ���
public class Array2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		
		System.out.println("=== ���� ������ ���� �迭 ===");		
		for (int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100);
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
		
		System.out.println("=== ���� �� ���� ===");
		int    sum = 0;
		double ave = 0.0;
		
		for (int i=0; i<score.length; i++)
			sum += score[i];
		
		ave = (double)sum / score.length;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + ave);		
	}
}

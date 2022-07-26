package week5;
//길이가 10인 정수 타입의 배열을 선언하다 -> int[] 배열이름 = new int[배열의 길이]
//각 배열 값에 랜덤하게 생성된 점수(0~99)를 대입한다 -> 랜덤함수
//최종 생성된 점수값과 총점 및 평균을 출력하시오 -> 반복문
public class Array2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		
		System.out.println("=== 랜덤 생성된 점수 배열 ===");		
		for (int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100);
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
		
		System.out.println("=== 총점 및 퍙군 ===");
		int    sum = 0;
		double ave = 0.0;
		
		for (int i=0; i<score.length; i++)
			sum += score[i];
		
		ave = (double)sum / score.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ave);		
	}
}

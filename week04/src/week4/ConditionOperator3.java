package week4;

import java.util.Scanner;

public class ConditionOperator3 {
	public static void main(String[] args) {
		
		int score;
		char grade;
		
		Scanner scanData = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요");
		score = scanData.nextInt();
		
		System.out.println("입력받은 성적 : " + score);
		
		grade = (score > 89)? 'A' : ((score > 79 )? 'B' : ((score > 69)? 'C' : ((score > 59)? 'D' : 'F'))); 
		System.out.println("등급 : " + grade);
		scanData.close();
	}
}


package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" SCORE\t\tGRADE");
		System.out.println("============================");
		
		int score;
		char grade;
		
		while (true) {
			score = sc.nextInt();
			if (score < 0)
				break; //음수면 멈춰!
			
			if (score >= 90) 
				grade = 'A';
				
			else if (score >= 80) 
				grade = 'B';
			
			else if (score >= 70) 
				grade = 'C';
				
			else if (score >= 60)
				grade = 'D';
				
			else
				grade = 'F';
			System.out.printf("   %d\t          %c\n", score, grade);
			}
			System.out.println("프로그램 종료");
			sc.close();
		}						
}


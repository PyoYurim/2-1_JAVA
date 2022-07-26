package week4;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bmi = "";
		
		System.out.print("이름을 입력하세요 : "); 
		String name = sc.nextLine();
		
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		double s_height = height / 100.0;
		
		System.out.print("몸무게(kg)를 입력하세요 : ");
		int weight = sc.nextInt();
		
		double result = weight / (s_height*s_height);
		
		if (result >= 30.0) 
			bmi = "고도비만";
	
		else if (result >= 25.0) 
			bmi = "비만";
	
		else if (result >= 23.0) 
			bmi = "과체중";
	
		else if (result >= 18.5)
			bmi = "정상";

		
		System.out.println(name + "님의 키는 " + height + "cm이고 몸무게는 " + weight + "kg입니다");
		System.out.println("BMI 지수는 " + (Math.round(result * 100) / 100.0) + "이고 " + bmi + "입니다");
		
		sc.close();		
	}

}

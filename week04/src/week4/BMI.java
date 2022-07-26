package week4;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String bmi = "";
		
		System.out.print("�̸��� �Է��ϼ��� : "); 
		String name = sc.nextLine();
		
		System.out.print("Ű(cm)�� �Է��ϼ��� : ");
		int height = sc.nextInt();
		double s_height = height / 100.0;
		
		System.out.print("������(kg)�� �Է��ϼ��� : ");
		int weight = sc.nextInt();
		
		double result = weight / (s_height*s_height);
		
		if (result >= 30.0) 
			bmi = "����";
	
		else if (result >= 25.0) 
			bmi = "��";
	
		else if (result >= 23.0) 
			bmi = "��ü��";
	
		else if (result >= 18.5)
			bmi = "����";

		
		System.out.println(name + "���� Ű�� " + height + "cm�̰� �����Դ� " + weight + "kg�Դϴ�");
		System.out.println("BMI ������ " + (Math.round(result * 100) / 100.0) + "�̰� " + bmi + "�Դϴ�");
		
		sc.close();		
	}

}

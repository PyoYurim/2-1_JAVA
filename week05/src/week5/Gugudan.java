package week5;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� ���� ����ұ�?");
		
		int scanData = sc.nextInt();
		
		System.out.println("������"+scanData+"���� ����Ѵ�.");
		for(int i=1; i<=9; i++ ) {
			System.out.println(scanData+ " * "+i+" = "+(scanData*i));
		}
	}
}

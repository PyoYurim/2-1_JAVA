package week9;

import java.util.Scanner;

public class CarEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inGas;
		boolean gasStat;
		
		Car myCar = new Car();
		myCar.setGas(5);
		
		while (true) {
			gasStat = myCar.isLeftGas();
			
			if (gasStat) {
				System.out.println("����մϴ�.");
				myCar.run();
				continue;
			}
			else {
				System.out.println("gas�� �����ϼ��� >> ");
				inGas = sc.nextInt();
				if (inGas == 0)
					break;
				else
					myCar.setGas(inGas);
			}
		}
		System.out.println("���α׷� ����");
		sc.close();
	}
}		
		//boolean gasStat = myCar.isLeftGas();
		
		//if (gasStat) {
			//System.out.println("����մϴ�.");
			//myCar.run();
		//}
		//else {
			//System.out.println("���ᰡ �����ϴ�.");
		//}
		//System.out.println("���α׷� ����");


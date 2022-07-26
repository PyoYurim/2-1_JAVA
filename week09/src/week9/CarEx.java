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
				System.out.println("출발합니다.");
				myCar.run();
				continue;
			}
			else {
				System.out.println("gas를 주입하세요 >> ");
				inGas = sc.nextInt();
				if (inGas == 0)
					break;
				else
					myCar.setGas(inGas);
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}		
		//boolean gasStat = myCar.isLeftGas();
		
		//if (gasStat) {
			//System.out.println("출발합니다.");
			//myCar.run();
		//}
		//else {
			//System.out.println("연료가 없습니다.");
		//}
		//System.out.println("프로그램 종료");


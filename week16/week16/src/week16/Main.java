package week16;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i);  //while문
//			i++;			
//		}
//		int i = 0;
//		do {
//			System.out.println(i);  //do while문
//			i++;
//		} while(i < 10);
		
		for(int i = 0; i < 10; i++) {
			if (i == 6) {
				continue;  //6만 빼고 출력이 된다.
			}
			System.out.println(i);
		}
		int[] score = new int[] {10, 20, 30, 40, 50}; //초기화
		//int[] score = {10, 20, 30, 40, 50}; //이런식으로 생략 가능
		
		ArrayList<Integer> scoreList = new ArrayList<>();
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		
		scoreList.add(2, 200);//리스트의 세번째에 200을 넣겠다
		//[10, 20, 200, 30, 40, 50]출력
		scoreList.remove(2);
		//[10, 20, 30, 40, 50]출력
		
		System.out.println(scoreList); 
		System.out.println(scoreList.size());//리스트에 담긴 사이즈 알 수 있음 5출력
		System.out.println(scoreList.get(4));//리스트 안에 있는 것을 출력	
	}
}
